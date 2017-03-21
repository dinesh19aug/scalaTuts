package week4

/**
  * Created by dinesh on 3/19/17.
  */
object MyModule {
  def abs(n:Int):Int={
    if(n<0) -n else n
  }

  def factorial(n:Int):Int={
    def calFact(x:Int, acc:Int):Int={
      if(x<=1) acc
      else calFact(x-1, x*acc)
    }
    calFact(n,1)
  }


  def formatFunction(funcName:String, n:Int, func:Int => Int)={
    val msg = "The %s of %d is %d"
    msg.format(funcName,n,func(n))
  }

  def main(args: Array[String]): Unit ={
    println(formatFunction("Absolute Value", -42, abs))
    println(formatFunction("factorial", 4, factorial))
  }
}



