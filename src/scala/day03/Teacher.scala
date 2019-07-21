package scala.day03

/**
  * 再scala中定义类使用class关键字修饰
  * 这个类默认有一个空参的构造器
  *
  * 定义在类名称后面的构造器叫做主构造器
  *
  * 如果主构造器中的成员属性没有val/var修饰的话，该属性不能被访问，相当于对外没有提供get方法
  * 如果成员属性使用var修饰的话，相当于对外提供了get/set方法
  * 如果成员属性使用val修饰的话，相当于对外提供了get方法
  *
  * 类的成员属性访问权限：
  *   如果类的主构造器中成员属性是private修饰的，他的set和get方法都是私有的，对外不提供访问权限
  *
  *  类的构造器访问权限：
  *   在构造器前加修饰权限
  *   private在主构造器之前，这说明该类的朱构造器是私有的，外部类和外部对象不能访问
  *   同样的，该权限也适用于辅助构造器
  *
  *  类的访问权限
  *   类的前面加上private[this],标识这个类在当前包下都可可见，当前包下的子包不可见
  *   类的前面加上private[package]，标识这个类在当前包和子包下都可见
  *
  */
class Teacher private(var name:String, val age:Int = 34) {
  val id:Int = 1
  var sex:String  = _
  private var prov:String = _

  println("俺是主构造器")

  /**
    * 定义一个辅助构造器，def this()
    * 辅助构造器的参数不能使用val/var修饰符
    * @param name
    * @param age
    * @param sex
    */
  def this(name:String, age:Int, sex:String){
    // 在辅助构造器中第一句话必须是先调用主构造器
    this(name, age)
    println("第一个辅助构造器")
    this.sex = sex
  }

  /**
    * 定义一个辅助构造器
    * @param name
    * @param age
    * @param sex
    * @param prov
    */
  def this(name:String, age:Int, sex:String, prov:String) {
    this(name, age, sex)
    println("第二个辅助构造器")
    this.prov = prov
  }

  /**
    * 打招呼
    */
  def sayHello(): Unit ={
    Teacher.sayHello(this.name)
  }
}

/**
  * 伴生对象中可以访问伴生类额私有成员和属性
  */
object Teacher {

  /**
    * 打招呼
    * @param name
    */
  private def sayHello(name:String) ={
    println(s"hello ${name}")
  }

  def main(args: Array[String]): Unit = {
    val teacher = new Teacher("天海翼", 25)
    teacher.sex = "女"
    println(s"袁老师的启蒙老师：${teacher.name}, 编号：${teacher.id}, 性别：${teacher.sex}，年龄：${teacher.age}")

    teacher.prov = "中国日本省"

    val teacher3 = new Teacher("吉泽老师", 28, "女", "日本省")
    println(s"鹏鹏的启蒙老师：${teacher3.name}, 编号：${teacher3.id}, 性别：${teacher3.sex}，年龄：${teacher3.age}")

    /**
      * 打招呼
      */
    teacher3.sayHello()
  }
}
