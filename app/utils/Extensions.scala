package utils

import java.nio.charset.StandardCharsets
import java.util.concurrent.ThreadLocalRandom

import play.api.Logger

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
  * Created by MAPAT on 3/27/2016.
  */
object Extensions {

  /** Right-biased Either */
  implicit class EitherExtended[A, B](e: Either[A, B]) {
    def map[Y](f: B => Y): Either[A, Y] = e.right.map(f)

    def flatMap[AA >: A, Y](f: B => Either[AA, Y]): Either[AA, Y] = e.right.flatMap(f)

    def flatMapFuture[AA >: A, Y](f: B => Future[Either[AA, Y]]): Future[Either[AA, Y]] = e match {
      case Right(x) => f(x)
      case Left(x) => Future.successful(Left(x))
    }
  }

  /** FutureOfEither, being used with for-comprehension syntax, is very useful abstraction
    * for working with async calls that can either success or fail.
    * It differs from scalaz.Task with error type.
    * scalaz.Task has Throwable on the left, but FutureOfEither can has any type there.
    * FutureOfEither extension is intended to be used with custom error hierarchy
    * that doesn't required to has Throwable as its root class.
    * Base error can be something like 'case class BaseError(message: String)',
    * or like 'ServiceException(message:String, errorCode: int, stackTrace:..., cause:...) extends Exception'
    *
    * TODO implement 'withFilter'
    * TODO it seems to be a bit incomplete abstraction: in contrast with scalaz.Task,
    * TODO FutureOfEither doesn't help to handle Future failure which is Throwable
    *
    * @see Extensions#futureOfEitherExamples
    * */
  implicit class FutureOfEither[A, B](e: Future[Either[A, B]]) {
    def mapEither[AA >: A, Y](f: B => Either[AA, Y]): Future[Either[AA, Y]] = e.map {
      case Right(x) => f(x)
      case Left(x) => Left(x)
    }

    def flatMapEither[AA >: A, Y](f: B => Future[Either[AA, Y]]): Future[Either[AA, Y]] = e.flatMap {
      case Right(x) => f(x)
      case Left(x) => Future.successful(Left(x))
    }

    def left: FutureOfEitherLeftProjection[A, B] = FutureOfEitherLeftProjection(e)

    def right: FutureOfEitherRightProjection[A, B] = FutureOfEitherRightProjection(e)
  }

  case class FutureOfEitherLeftProjection[A, B](e: Future[Either[A, B]]) {
    def map[Y](f: A => Y): Future[Either[Y, B]] = e.map {
      case Right(x) => Right(x)
      case Left(x) => Left(f(x))
    }

    def flatMap[X, BB >: B](f: A => Future[Either[X, BB]]): Future[Either[X, BB]] = e.flatMap {
      case Right(x) => Future.successful(Right(x))
      case Left(x) => f(x)
    }

    def foreach[Y](f: A => Y): Future[Any] = e.map {
      case Right(x) => Unit
      case Left(x) => f(x)
    }
  }

  case class FutureOfEitherRightProjection[A, B](e: Future[Either[A, B]]) {
    def map[Y](f: B => Y): Future[Either[A, Y] with Product with Serializable] = e.map {
      case Right(x) => Right(f(x))
      case Left(x) => Left(x)
    }

    def flatMap[AA >: A, Y](f: B => Future[Either[AA, Y]]): Future[Either[AA, Y]] = e.flatMapEither(f)

    def foreach[Y](f: B => Y): Future[Any] = e.map {
      case Right(x) => f(x)
      case Left(x) => Unit
    }
  }

  /** Examples */
  // http response
  class HttpResponse(val responseCode: Int, val headers: Map[String, Seq[String]], val body: Array[Byte])

  case class Ok(override val headers: Map[String, Seq[String]], override val body: Array[Byte]) extends HttpResponse(200, headers, body)

  object Ok {
    def apply(body: String): Ok = Ok(Map.empty, body.getBytes(StandardCharsets.UTF_8))
  }

  // response/error hierarchy
  abstract class BaseError(val message: String, val errorCode: Int) {
    def toHttpResponse = new HttpResponse(errorCode, Map.empty, message.getBytes(StandardCharsets.UTF_8))
  }

  case class NotFound(override val message: String = "Not found", override val errorCode: Int = 404) extends BaseError(message, errorCode)

  class BadRequest(override val message: String = "Bad request", override val errorCode: Int = 400) extends BaseError(message, errorCode)

  case class CantCompute(override val message: String = "Can't compute", override val errorCode: Int = 400) extends BadRequest(message, errorCode)

  // some methods to be called
  def blockingMethodOk(): Right[BaseError, Int] = Right[BaseError, Int](ThreadLocalRandom.current().nextInt(100))

  def asyncMethodOk(n: Int): Future[Either[BaseError, Int]] = Future.successful(Right[BaseError, Int](n * n))

  def asyncMethodErr(n: Int): Future[Either[CantCompute, Int]] = Future.successful(Left[CantCompute, Int](CantCompute()))

  private def futureOfEitherExample() = {
    val errorResponse: Future[HttpResponse] = (for {
      a <- Future.successful(blockingMethodOk()).right // wrap to Future
      b <- asyncMethodOk(a).right
      c <- asyncMethodErr(b) // this will cause error (Future.successful(Left(...)))
    } yield c)
      .right.map(x => Ok(x.toString))
      .left.map(x => {
      Logger.logger.error(x.message)
      x.toHttpResponse
    }).map(_.merge)
  }

}
