//
object hello{


  def main(args: Array[String]){
    perform((x:Int, y:Int)=> x*y)
    println(product((x:Int)=>(4)))
  }

  def perform(f:(Int, Int)=>Int){
    println(f(12,3))

  }

  def sum(f:Int => Int):(Int,Int)=> Int ={
    def sumUpto(a:Int, b:Int): Int ={
      if(a>b) 0
      else f(a) + sumUpto(a+1,b);
    }
    sumUpto
  }

  def product(f:Int => Int):(Int, Int)=> Int={
    def productUpto(x:Int, y:Int): Int={
      if(x>y) 1
      else f(x) * productUpto(x+1,y)
    }
    productUpto
  }
}