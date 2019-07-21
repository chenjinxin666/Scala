package scala.day04.upper

class Person

class Teacher extends Person

class Student extends Person

class Animal

class Dog extends Animal

class Cat extends Animal

class UpperBound[S <: Person]{
  def say(p:S)={
    println(p.getClass)
  }
}
object UpperBound{
  def main(args: Array[String]): Unit = {
    val p = new UpperBound[Person]
   // val t = new Teacher
    val s = new Student
   // p.say(t)
    p.say(s)
    //val t2 = new UpperBound[Teacher]
    //t2.say(t)

    //以下代码会报错，因为animal不属于person及其子类，不能作为UpperBound这个类的泛型
    //val a1 = new UpperBound[Animal]
    //a1.say()

  }
}
