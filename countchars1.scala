#!scala
@main def entryPoint(args: String*) = {
  import scala.io.Source

  if (args.length > 0) {
    for (line <- Source.fromFile(args(0)).getLines())
      println(line.length.toString + " " + line)
  }
  else
    Console.err.println("Please enter filename")
}
