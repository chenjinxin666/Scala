package scala.day03

/**
  * 在scala中特质是一个特殊的概念，特质的用途非常多，可以作为类似java的interface使用
  * 类可以支持特质多重继承，继承的时候统一的使用extends关键字
  */
trait TraitDemo01_01 {
  //使用val修饰的非抽象字段，可以被重写
  val name:String = "熊大"

  //使用var修饰的非抽象字段，不能被重写
  var age:Int = 23

  //抽象字段，不管是使用val还是var，都需要被重写
  var sex :String

  //抽象方法
  def say(context:String)
}

trait TraitDemo01_02{
  //抽象方法
  def sayHello(context:String)
}
class  TraitDemo01 extends TraitDemo01_01 with TraitDemo01_02{
  //抽象字段，可以选择性的加override
  var sex: String = "公"
  //非抽象字段，必须要加override
  override val name: String = "熊二"

  override def say(context: String): Unit = {
    println(context)
  }

  override def sayHello(context: String): Unit = {
    println(context)
  }
}

object  TraitDemo01{
  def main(args: Array[String]): Unit = {
    val traitDemo = new TraitDemo01
    traitDemo.say("hello tom！")
    traitDemo.sayHello("hello mike！")
    println(traitDemo.age)


  }
}