//package week2

object FilesMatcher {

   def filesHere = (new java.io.File("/home/dinesh/IdeaProjects/Example/src/main/scala")).listFiles

  def filesEnding(query: String) =
    filesMatching(query, _.endsWith(_))


    println("End With *****")
    filesEnding(".sc")

  def filesContaining(query: String) =
    filesMatching(query, _.contains(_))

  println("Containing  *****")
  filesContaining("functio")

  def filesRegex(query: String) =
    filesMatching(query, _.matches(_))

  def filesMatching(query: String,
                    matcher:(String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
    yield file
  }
}

