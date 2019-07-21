package scala.day04.casedemo

object CaseDemo03 {
  def main(args: Array[String]): Unit = {

    //假如集合是空的， 没有包含任何元素，则不可以跟常量匹配（报错）
    //如果集合中定义了浮点类型， 是可以跟整数做匹配的
    val arr = Array(1.0, 1, 7, 0)
    arr match {
      case Array(1, 2, x, y) => println(s"x:${x}, y:${y}")
      case Array(0, 2, x, 0) => println(s"y:0")
      case Array(1, 1, x, y) => println(s"aaaa ${x} ${y}")
      case Array(1, 1, 7, 0) => println("0")
      case _ => println("something else")
    }
    println("===========================list====================================")
    val list = List(0, 3, 6, 7)
    println(list.head)
    println(list.tail)
    list match {
      case 0 :: Nil => println("only 0")
      case x :: y :: Nil => println(s"x ${x} y ${y}")
      case 0 :: f => println(s"name:${f}")
      case _ => println("something else")
    }

    println("===========================tuple====================================")
    val tup = (6,3,5)
    tup match {
      case (1, x, y) => println(s"x ${x}, y ${y}")
      case (_, x, 5) => println(s"x ${x}")
      case _=> println("else")
    }

    println("===========================map====================================")
    val tupArr = Array(("a", 1, 1.0), ("b", 2, 2.0))
    val r: Array[(String, Int, Double)] = tupArr.map(tp=>(tp._1, tp._2, tp._3))
    val tuples = r.map {
      case (a, b, 1) => (a, b + 10)
      case (a, b, c) => (a, b + c)
    }
    println(tuples.toBuffer)
  }
}
