package day03.`trait`

trait t{
  def say={
    println("hello")
  }
}

class TraitWith1(val name:String,var age:Int)

object TraitWith1{
  def main(args: Array[String]): Unit = {
    val t1=new TraitWith1("aA",12)
    val t2=new TraitWith1("bb",12) with t
    println(t1.age+" "+t1.name)
    println(t2.age+" "+t2.name)
    t2.say
  }
}