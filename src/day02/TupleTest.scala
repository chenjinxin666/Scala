package day02

object TupleTest {
  def main(args: Array[String]): Unit = {
    val t=("苍井空","f",30)
    println(s"姓名：${t._1}，性别：${t._2},年龄：${t._3}")

    val t1,t2,(name,sex,age)=t
    println(t1)
    println(t2)
    println(s"姓名：${name}，性别：${sex},年龄：${age}")

    val a=Array("a","b","c","d")
    val b=Array("A","B","C")
    val c=a.zip(b)
    println(c.toList)
  }
}
