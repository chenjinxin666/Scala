package day05.viewBound

class Gril(val name: String, val works: Int)

class MyGrilPair[T] {
  //使用柯里化实现视图界定的功能
  def choose(g1: T, g2: T)(implicit org: T => Ordered[T]) = {
    if (g1 > g2) g1 else g2
  }

  //使用柯里化的方式实现上下文界定的功能
  def select(g1: T, g2: T)(implicit org: Ordering[T]) = {
    if (org.gt(g1, g2)) g1 else g2
  }
}

object MyGrilPair {
  def main(args: Array[String]): Unit = {
    val g = new MyGrilPair[Gril]
    val g1 = new Gril("苍井空", 300)
    val g2 = new Gril("波多野结衣", 260)

    import MyPredef._
    println(g.select(g1, g2).name)
    //优先级：obj>val>def
  }
}