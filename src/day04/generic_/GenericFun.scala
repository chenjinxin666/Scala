package day04.generic_

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
    * 在函数中使用泛型，取代上面的两个函数
    * ClassTag：标示scala值运行时的状态信息，这里标示调用时的数据类型
    * 需要导入一个反射包
    * @param elem T* ：可变长的 T 数组
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
    println(mkArray[Int](1,2,3,4,5,6).toBuffer)
    println(mkArray[String]("苍老师","波多老师").toBuffer)

    println(say[String, Int, Student02]("苍老师", 35))
    println(say[String, Int, Person02]("苍老师", 35))

    println(say[Int, Int, Student02](12, 35))//(12,35)

  }
}


