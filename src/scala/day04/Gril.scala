package main.scala.day04

class Gril(val name:String, var faceValue:Int)  extends Ordered[Gril]{
  override def compare(that: Gril): Int = {
    this.faceValue - that.faceValue
  }

  override def toString: String = s"Gril($name, $faceValue)"
}

class MyGril[T] {
  def faceValueSome(g1:Gril, g2:Gril):Gril={
    if(g1 > g2) g1 else g2
  }
}

object Gril extends App {
  var arr = Array[Gril](new Gril("苍老师", 90), new Gril("波多老师", 95), new Gril("吉泽老师", 94))

  val sorted =  arr.sortBy(x=> x)
  println(sorted.toBuffer)

  val myGril = new MyGril[Gril]
  val s = myGril.faceValueSome(new Gril("苍老师", 90), new Gril("波多老师", 95) )
  println(s.name)
}