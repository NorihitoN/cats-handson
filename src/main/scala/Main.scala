import cats._
import cats.syntax.all._
import cats.effect.{IO, IOApp, ExitCode}
import org.http4s.client.Client
import org.http4s.client.blaze.BlazeClientBuilder
import scala.concurrent.ExecutionContext
import java.util.concurrent.Executors

object Main extends IOApp {

  def withHttpClient[A](f: Client[IO] => IO[A]): IO[A] = {
    val threadPool = Executors.newFixedThreadPool(3)
    val httpEc = ExecutionContext.fromExecutor(threadPool)

    BlazeClientBuilder[IO](httpEc).resource.use(f)
  }

  def search(httpClient: Client[IO], q: String): IO[String] = {

    import io.circe.Json
    import org.http4s.Uri
    import org.http4s.circe._

    val baseUri = Uri.unsafeFromString("https://api.duckduckgo.com")
    val target = baseUri
      .withQueryParam("q", q + " pizza")
      .withQueryParam("format", "json")

    httpClient.expect[Json](target).map { json =>
      json.findAllByKey("Abstract").headOption.flatMap(_.asString).getOrElse("No results")
    }
  }

  override def run(args: List[String]): IO[ExitCode] = {
    withHttpClient { httpClient =>
      search(httpClient, "New York").flatMap { result =>
        IO(println(result))
      }
    }.as(ExitCode.Success)
  }
}
