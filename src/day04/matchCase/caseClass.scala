package day04.matchCase

/**
  * 样例类 Case Class
  * 样例类也是一个类， 只是一个特殊的类，能够被用于模式匹配
  * 当一个类被声明为case class以后，scala会帮助我们做一下几个事
  * 1：构造器中的参数如果不被声明var的话。默认是val类型，但是一般不推荐将构造器中的参数声明为var
  * 2：自动创建伴生对象，同时在里面给我们实现了apply方法，使我们在使用的时候不需要new创建对象
  * 3：实现自己的toString、hashCode、copy、equals方法
  * 除此之外， 与普通类并无二致
  */
//定义一个抽象的Person
abstract class Person

//样例类
case class Teacher(name:String, age:Int, teacNo:String) extends Person

//样例类
case class Student(name:String, age:Int, stuNo:String) extends Person

//样例类
case class NoBody(name:String) extends Person

object caseClass {
  def main(args: Array[String]): Unit = {
    val p:Person = Teacher("石川施恩惠老师", 20,"101")

    val s:Person = Student("李文汉", 23, "201")

    //match case模式匹配
    p match {
      case Teacher(name, age, teacNo) => println(s"老师:${name}, $age, $teacNo")
      case Student(name, age, stuNo)  => println(s"学生:${name}, $age, $stuNo")
      case NoBody(name) => println(s"其他人:${name}")
    }
  }
}
