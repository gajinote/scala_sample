#!scala
@main def entryPoint(args: String*) = {
  val greetStrings = new Array[String](3)

  greetStrings.update(0 ,"Hello")
  greetStrings.update(1, ", ") 
  greetStrings.update(2, "world!\n")

  for (i <- 0.to(2))
    print(greetStrings.apply(i))
}
