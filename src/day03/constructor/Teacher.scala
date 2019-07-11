package day03.constructor

class Teacher private(var name:String,var age:Int = 34){
  println("主构造器")
  val id:Int = 1
  var sex:String = _
  private var prov:String=_

  def this(name:String,age:Int,sex:String){
    this(name,age)
    println("第一个辅助构造器")
    this.sex=sex
  }

  def this(name:String,age:Int,sex:String,prov:String){
    this(name,age,sex)
    println("第二个辅助构造器")
    this.prov = prov
  }

  def sayHello():Unit={
    Teacher.sayHello(this.name)
  }
}

object Teacher{
  private def sayHello(name:String): Unit ={
    println(s" hello ${name}")
  }

  def main(args: Array[String]): Unit = {
    val t1=new Teacher("天海翼",25)
    t1.sex="f"
    println(s"编号：${t1.id},姓名：${t1.name}，年龄：${t1.age}，性别：${t1.sex},省份：${t1.prov}")
    t1.sayHello()

    val t2 = new Teacher("吉泽",28,"女","日本省")
    println(s"编号：${t2.id},姓名：${t2.name}，年龄：${t2.age}，性别：${t2.sex},省份：${t2.prov}")
    t2.sayHello()
  }
}
