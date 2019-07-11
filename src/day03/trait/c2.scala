package day03.`trait`

trait a0{
  println("1:trait a0")
}
trait ba1 extends a0{
  println("2:trait ba1")
}
trait ba2 extends a0{
  println("3:trait ba2")
}
class c{
  println("4:class c")
}
class c2 extends c with ba1 with ba2 {
  println("5:class c2")
}
object c2{
  def main(args: Array[String]): Unit = {
    new c2
  }
}