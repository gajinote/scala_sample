#!scala
@main def entryPoint(args: String*) = {
  var i = 0
  while (i<args.length) {
    println(args(i))
    i+=1
  }
}
