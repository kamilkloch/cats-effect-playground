import cats.effect._
import cats.implicits._

object HelloCatsEffect extends IOApp {

  def run(args: List[String]): IO[ExitCode] = {
    IO(println(s"Hello, cats-effect!")).as(ExitCode.Success)
  }

}