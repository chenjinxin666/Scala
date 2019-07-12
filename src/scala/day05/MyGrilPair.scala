package main.scala.day05

/**
  * 定义
  * @param name
  * @param works
  */
class Gril(val name:String, val works:Int)

class MyGrilPair[T]{
  //使用柯里化实现视图界定的功能
  def choose(g1:T, g2:T)(implicit ord:T=> Ordered[T])={
    if(g1 > g2) g1 else g2
  }

  //使用柯里化的方式实现上下文界定的功能
  def select(g1:T, g2:T)(implicit ord:Ordering[T])={
    if(ord.gt(g1, g2)) g1 else g2
  }
}

object MyGrilPair {
  def main(args: Array[String]): Unit = {
    val grils = new MyGrilPair[Gril]
    val g1 = new Gril("苍老师", 300)
    val g2 = new Gril("吉泽老师", works = 150)

    import MyPredef._
    val g = grils.select(g1, g2)
    println(g.name)
  }
}
