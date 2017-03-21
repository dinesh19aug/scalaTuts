package week3
class Rational(x:Int, y:Int){
  require(y!=0, "Denominator must not be 0!")

 private def gcd(a:Int,b :Int):Int = if (b==0) a else gcd(b, a%b)
 private val g= gcd(x,y)
  val numer =x/g
  val denom = y/g

  def add(that: Rational)= {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  }

  def neg:Rational  = new Rational(-numer, denom)

  def sub(that: Rational)= {
    add(that.neg)
  }

  def less(that:Rational):Boolean = {
    numer * that.denom < that.numer * denom
  }

  def max(that:Rational):Rational = {
    if(numer * that.denom < that.numer * denom) that else this
  }

  override def toString = numer + "/" +  denom
}



val x = new Rational(1,3)

val y = new Rational(5,7)
val z = new Rational(3,0)
println("Add:" + x.add(y))
println("Neg:" + x.neg)
println(x.sub(y))
println(x.sub(y).sub(z))
println(y.add(y))
println("Less:" + y.less(x))
println("Max:" + z.max(y))


