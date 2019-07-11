package day04.bound

class a1
class b1a1 extends a1
class b2a1 extends a1
class c1b1 extends b1a1
class d1a1 extends a1
class e1b1 extends b1a1

class LowerBound[T >: b1a1] {
  def say(p: T): Unit = {
    println(p.getClass)
  }
}
object LowerBound {
  def main(args: Array[String]): Unit = {
    val a =new LowerBound[a1]
    a.say(new a1)
  }
}
