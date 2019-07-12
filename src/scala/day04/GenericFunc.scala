package main.scala.day04

import scala.reflect.ClassTag

class  Person02{
  var name:String =_
  var age:Int = _
}

class  Student02{
  var stuName:String =_
  var stuAge:Int = _
}
/**
  * 泛型函数
  */
object GenericFunc {

  /**
    * 定义一个函数，创建一个int类型的数组
    * @param elem
    * @return
    */
  def mkIntArray(elem:Int*) = Array[Int](elem:_*)

  /**
    * 定义一个函数，创建一个String类型的数组
    * @param elem
    * @return
    */
  def mkStringArray(elem:String*) = Array[String](elem:_*)

  /**
    * 在函数中使用泛型，取代上面的两个函数
    * ClassTag：标示scala值运行时的状态信息，这里标示调用时的数据类型
    * 需要导入一个反射包
    * @param elem
    * @tparam T
    * @return
    */
  def mkArray[T:ClassTag](elem:T*) = Array[T](elem:_*)

  /**
    * 定义泛型函数
    * @param name
    * @param age
    * @tparam T1
    * @tparam T2
    * @tparam T3
    * @return
    */
  def say[T1, T2, T3](name:T1, age:T2):T3 ={
    //println(s"name:${name}, age:${age}")
    //(s"name:${name}, age:${age}").asInstanceOf[T3]
    (name, age).asInstanceOf[T3]
  }

  def main(args: Array[String]): Unit = {
//    println(mkIntArray(1,2,3,4,5,6).toBuffer)
//    println(mkStringArray("苍老师","波多老师").toBuffer)

    println(mkArray[Int](1,2,3,4,5,6).toBuffer)
    println(mkArray[String]("苍老师","波多老师").toBuffer)

    //say[String, Int, Person02]("苍老师", 35)
    println(say[String, Int, Student02]("苍老师", 35))

  }
}
