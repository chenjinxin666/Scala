package day04.sort_scala

class Gril2(val name: String, var faceValue: Int) extends Ordered[Gril2] {
  override def compareTo(that: Gril2): Int = {
    this.faceValue - that.faceValue
  }

  override def compare(that: Gril2): Int = this.faceValue - that.faceValue

  override def toString: String = s"Gril2($name, $faceValue)"
}

object Gril2 extends App {
  var arr = Array[Gril2](new Gril2("苍老师", 90), new Gril2("波多老师", 95), new Gril2("吉泽老师", 94))

  val sorted = arr.sortWith((g1: Gril2, g2: Gril2) => g1 < g2)
  println(sorted.toBuffer)

}