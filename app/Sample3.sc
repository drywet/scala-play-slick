import java.util.concurrent.{LinkedBlockingDeque, ThreadPoolExecutor, TimeUnit}

import play.api.libs.ws.WSClient
import play.api.libs.ws.ning.NingWSClient

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}

implicit val context = ExecutionContext.fromExecutor(
  new ThreadPoolExecutor(5, 5, 1, TimeUnit.DAYS, new LinkedBlockingDeque[Runnable]()))



val ws: WSClient = NingWSClient()
Await.result(Future.sequence(
  (1 to 10)
    .map(i =>
      ws.url("http://vk.com/favicon.ico").get()
        .map(_.body.length.toString)
    )
), Duration.Inf).length
//rr