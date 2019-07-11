package day03.apply

class Person {
  println("class")
  var name: String = _
  var age: Int = _
}

object Person {
  def apply(name: String) = {
    println("apply1")
    val p = new Person()
    p.name = name
    p
  }

  def apply(name: String, age: Int) = {
    println("apply2")
    val p = new Person()
    p.name = name
    p.age = age
    p
  }

  def apply(p: Person) = {
    println("apply0")
    p
  }

}

object PersonTest {
  def main(args: Array[String]): Unit = {
    val p=new Person
    val p1=Person("apply")
    val p2=Person("apply",12)
    val p0=Person(p)

  }
}