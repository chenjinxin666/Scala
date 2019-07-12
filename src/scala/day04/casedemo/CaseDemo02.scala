package main.scala.day04.casedemo

object CaseDemo02 {
  def main(args: Array[String]): Unit = {
    val arr: Array[Any] = Array("hello", 1, -2.0, CaseDemo02, 2L)

    //取出一个元素
    val elem = arr(2)
    println(elem)
    elem match {
      case x:Int => println("Int")
      case y:Double if(y<=0) => println("Double")
      case z:Double => println("Double2")
      case x:String => println(s"String：${x}")
      case w:Long => println(s"Long：${w}")
      case CaseDemo02=> {
        val demo = CaseDemo02
        println("case demo 02")
      }
      case _=>{
        println("default")
      }
    }
  }
}
