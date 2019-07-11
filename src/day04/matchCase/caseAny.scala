package day04.matchCase

import scala.util.Random

object caseAny {
  def main(args: Array[String]): Unit = {
    val arr: Array[Any] =Array('c',1,1.0,"s",caseAny,1L)
    val i=Random.nextInt(arr.length)
    print(i+" ")
    arr(i) match {
      case _:Char => println("Char")
      case _:Int => println("Int")
      case _:Double => println("Double")
      case _:String => println("String")
      case caseAny => println("caseAny")
      case _:Long => println("Long")
      case _ => println("default")
    }
  }
}
