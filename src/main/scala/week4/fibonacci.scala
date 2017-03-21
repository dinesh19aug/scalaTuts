package week4

/**
  * Created by dinesh on 3/19/17.
  */
object fibonacci {
  def fibonacci(endValue:Int): Unit ={
    @annotation.tailrec
    def calculateFibonacci(prevSum:Int,nextSum:Int, ctr:Int): Unit = {
        if (ctr <= endValue) {
          print(" " + (prevSum))
          calculateFibonacci(nextSum, nextSum = nextSum+prevSum, ctr = ctr + 1)
        }
      }

    calculateFibonacci(0,1,0)
  }



  def main(args: Array[String]): Unit = {
    fibonacci(5)
  }
}
