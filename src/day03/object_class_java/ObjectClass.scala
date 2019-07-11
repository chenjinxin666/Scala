package day03.object_class_java

class  ObjectClass{
  private def add(x:Int,y:Int)={
    x+y
  }
}
object ObjectClass {
  val oc=new ObjectClass
  println("伴生类")

  def add(x:Int,y:Int)={
    oc.add(x,y)
  }
}

object  test{
  def main(args: Array[String]): Unit = {
    println(ObjectClass.add(1,2))

    println(JavaDataUtils.getCurrentDate)
    println(JavaDataUtils.getCurrentTime)
  }
}
