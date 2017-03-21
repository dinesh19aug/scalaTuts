def fileLines(file: java.io.File)= {
  scala.io.Source.fromFile(file).getLines().toList
}

def grep(pattern: String) {
  val filesHere = (new java.io.File("/home/dinesh/Downloads/album/public")).listFiles
  for (
    file <- filesHere
    if (file.getName.endsWith(".txt")))
    println(file.getName)

  for (
    file <- filesHere
    if (file.getName.endsWith(".txt"));

    line <- fileLines(file)
      //if(line.trim.matches(pattern))

  ) println(file + ":" + line)
}

 // val x=grep("/^ban/")

def albumFiles = {
  val filesHere = (new java.io.File("/home/dinesh/Downloads/album/public")).listFiles
  for (file <- filesHere)
    yield file
}

 albumFiles






