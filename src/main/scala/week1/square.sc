import scala.annotation.tailrec

object square{

  def sqrt(x:Double)= {
    def squrIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess)) guess
      else squrIter(improve(guess), x)

    def isGoodEnough(guess: Double) =
      math.abs(x - (guess * guess)) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2


    squrIter(1.0, x)
  }
  sqrt(4)
  sqrt(0.001)

  sqrt(0.1e-6)
  sqrt(1.0e60)


  val factorial ={
    def fact(result:Int,x:Int):Int =
      if(x==0) result else  fact(result*x, x-1)

    fact(1,6)
  }





}

var jetSet=Set("Boeing","Airbus")
jetSet += "Lear"
println(jetSet)


