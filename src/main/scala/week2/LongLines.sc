import scala.io.Source

object  LongLines{

  def processFiles(fileName:String, width:Int)={
    def processLines(line: String) = {
      if(line.length >width){
        println(fileName + ": " + line.trim )
      }
    }

    val source = Source.fromFile(fileName)
    for(line <- source.getLines()){
      processLines(line)
    }
  }



  def main(args: Array[String]): Unit = {
    val width = args(0).toInt
    for(arg <- args.drop(1)){
      processFiles(arg,width )
    }

  }
}