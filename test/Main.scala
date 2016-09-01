import java.util.concurrent.TimeUnit

import com.ning.http.client.AsyncHttpClientConfig
import play.api.libs.ws.WSClient
import play.api.libs.ws.ning.NingWSClient

import scala.concurrent.ExecutionContext
import scala.concurrent.forkjoin.ThreadLocalRandom


object Main {

  def main(args: Array[String]): Unit = {
    val pool = new LoggingThreadPool("NORM POOL", 1, 1, 1, TimeUnit.DAYS, new LoggingLinkedBlockingQueue[Runnable]("NORM QUEU"))
    val wsPool = new LoggingThreadPool("WSCL POOL", 40, 40, 1, TimeUnit.DAYS, new LoggingLinkedBlockingQueue[Runnable]("WSCL QUEU"))
    implicit val context = ExecutionContext.fromExecutor(pool)

    val ws: WSClient = NingWSClient(new AsyncHttpClientConfig.Builder().setExecutorService(wsPool).build())
    System.out.println(
      //Await.result(Future.sequence(
      (1 to 5)
        .map(i => {
          System.out.println("+ " + i)
          /*val r = Future {
            Thread.sleep(1)
          }.map(rr => {
            System.out.println("got " + i)
            1111.toString
          })*/
          val r = ws.url("http://vk.com/favicon.ico?rnd=" + ThreadLocalRandom.current().nextLong()).get()
            .map(rr => {
              //System.out.println(Thread.currentThread().getName)
              //new Exception().printStackTrace()
              System.out.println("got " + i)
              rr.body.length.toString
            })
          System.out.println("- " + i)
          r
        })
      //), Duration.Inf)
    )
    //rr

  }
}


