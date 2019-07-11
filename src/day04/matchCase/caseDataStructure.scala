package day04.matchCase

object caseDataStructure {
  def main(args: Array[String]): Unit = {
    /**
      * 如果目标匹配内容中数据类型不统一会出现一些情况：数据类型放大甚至有同时存在的情况
      * （猜测：按照内容中最大字节数据结构统一，如果字节数相同则同时存在）
      * 如果待匹配的内容中有标识符，则可以作为万能对应单元
      */
    val arr = Array(1.0, 2, 3, 4)
    arr match {
      case Array(1, 2, 3, 0) => println(s"1 ")
      case Array(1, 3, x, 4) => println(s"2 ${x}")
      case Array(a, 2, x1, x2) => println(s"3 ${a} ${x1} ${x2}")
      //Array(1.0, 2, 3, 4) 3 1.0 3.0 4.0
      //Array(1.0, 2, 3, "4") 3 1.0 3 4
      case Array(1, 2, y, z) => println("4 0")
      case _ => println("something else")
    }

    println("===========================list====================================")
    /**
      * 待匹配的内容用 "::" 分隔，标识符作用同上
      */
    val list = List(0, 3, 6, 7)
    println(list.head)
    println(list.tail)
    list match {
      case 0 :: Nil => println("1 only 0")
      case x :: y :: Nil => println(s"2 x ${x} y ${y}")
      case 0 :: f => println(s"3 name:${f}")
      case _ => println("something else")
    }
    println("===========================tuple====================================")
    /**
      * 待匹配的内容用 "::" 分隔，标识符作用同上
      */
    val tup = (2,3,5)
    tup match {
      case (1, x, y) => println(s"x ${x}, y ${y}")
      case (_, x, 5) => println(s"x ${x}")
      case _=> println("else")
    }
    println("===========================map====================================")
    /**
      * 每一个元组进行一次匹配
      */
    val tupArr = Array(("a", 1, 1.0), ("b", 2, 2.0))
    val r: Array[(String, Int, Double)] = tupArr.map(tp=>(tp._1, tp._2, tp._3))
    val tuples = r.map {
      case (a, 1, c) => (a, c+1)
      case (a, 2, c) => (a, c+10)
    }
    println(tuples.toBuffer)
  }
}
