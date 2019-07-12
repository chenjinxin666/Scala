package main.scala.day05.covariant

/**
  * 协变：scala中非常有特色的函数，它完美的解决了java中泛型的一些缺陷
  * 比如：Professor是Master的子类， 那么Card[Professor]是不是Card[Master]的子类？
  * 总结：scala中的协变其实就是泛型类的上边界的增强版
  */
//大师类
class Master

//专家类
class Professor extends Master

//教师类
class Teacher

/**
  * 这个就是协变，我们知道Professor是Master的子类，那么在这里CovariantCard[Professor]也会是CovariantCard[Master]的子类
  * @tparam T
  */
class Card[+T]

class CovariantDemo {
    def enterMeet(card:Card[Master])={
      println("只有大师及其下一级别的人才能进入会场")
    }
}
object CovariantDemo{
  def main(args: Array[String]): Unit = {
    val cm = new Card[Master]
    val cp = new Card[Professor]
    var ct = new Card[Teacher]

    val demo = new CovariantDemo
    demo.enterMeet(cm)

  }
}
