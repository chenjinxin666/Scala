package scala.day03

//1
trait TraitDemo02 {
println("1：TraitDemo02的主构造代码块")
}
//2
trait TraitDemo02_01 extends TraitDemo02{
  println("2：TraitDemo02_01的主构造代码块")
}
//3
trait TraitDemo02_02 extends TraitDemo02{
  println("3：TraitDemo02_02的主构造代码块")
}
//4
class Person02{
  println("4：Person02的主构造代码块")
}
//5
class Student02 extends Person02 with TraitDemo02_01  with TraitDemo02_02 {
  println("5：Student02的主构造代码块")
}
object Student02{
  def main(args: Array[String]): Unit = {
    //5,4,2,1,3
    //4,5,1,2,1,3
    //4,5,1,2,3
    //class Student02 extends Person02 with TraitDemo02_01  with  TraitDemo02_02 { 正确：4,1,2,3,5
    //class Student02 extends Person02 with TraitDemo02_02 with TraitDemo02_01 {   正确：4,1,3,2,5
    /**
      *
      */
    new Student02
  }
}
