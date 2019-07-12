package main.scala.day04.lower

/**
  * 泛型的下界
  */
//教授
class Master
//专家
class Professor extends Master
//教师
class Teacher extends Professor

/**
  * 下边界 >:
  */
class LowerBound[T >: Professor] {
  def say(p: T) = {
    println(p.getClass)
  }
}

object LowerBound{
  def main(args: Array[String]): Unit = {
    //master可以作为LowerBound的泛型，因为Master是Professor的父类
    val m1 = new LowerBound[Master]
    m1.say(new Master)

    //Professor可以作为LowerBound的泛型，因为Professor是Professor的本身
    val p1 = new LowerBound[Professor]

    //Teacher可以作为LowerBound的泛型，因为Teacher是Professor的子类
    //val t1 = new LowerBound[Teacher]
  }
}
