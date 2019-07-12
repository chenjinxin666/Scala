package main.scala.day03

class Person  {
  var name:String =_
  var age :Int = _
}

object Person{
  def apply(name:String): Person = {
    val person = new Person()
    person.name = name
    person
  }

  /**
    * 方法中的参数不能使用val/val关键字
    * @param name
    * @param age
    * @return
    */
  def apply(name:String, age:Int): Person = {
    val person = new Person()
    person.name = name
    person.age = age
    person
  }

  def apply(person:Person): Person = {
    person
  }
}

object  PersonTest{

  def main(args: Array[String]): Unit = {
    val person = new Person
    person.name = "Tom"
    person.age = 23
    println(s"实例化调用：name:${person.name}, age:${person.age}")

    val person2 = Person("Mike")
    println(s"apply方法调用：name:${person2.name}, age:${person2.age}")

    val person3 = Person("Marry", 30)
    println(s"apply方法调用：name:${person3.name}, age:${person3.age}")

    val person4 = Person(person)
    println(s"apply方法调用：name:${person4.name}, age:${person4.age}")
  }
}