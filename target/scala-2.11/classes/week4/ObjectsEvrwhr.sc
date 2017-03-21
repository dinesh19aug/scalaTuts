abstract class Boolean{

  def ifThenElse[T] (t: => T ,e: => T): T

  def &&  (x: => Boolean): Boolean = ifThenElse(x, false)

  def || (x: => Boolean): Boolean = ifThenElse(true,x)

}
