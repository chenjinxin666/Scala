package main.scala.day05

class ComparInt(x:Int, y:Int) {
  def bigger = if(x>y) x else y
}
class ComparLong(x:Long, y:Long){
  def bigger =if(x>y) x else y
}

//class ComparComm[T <: Comparable[T]](o1: T, o2:T){
//  def bigger = if(o1.compareTo(o2) > 0) o1 else o2
//}
/**
  * 视图界定，戴上了眼镜，扩大了视野，看的远且广
  *   会发生隐式转换
  *  普通的上界：只会查找T本身及其子类对象
  *  视图界定：会查找T及其子类对象，或者能够隐式转换为其子类的对象
  * @param o1
  * @param o2
  * @param ev$1
  * @tparam T
  */
class ComparComm[T <% Comparable[T]](o1: T, o2:T){
  def bigger = if(o1.compareTo(o2) > 0) o1 else o2
}

object ViewBound {
  def main(args: Array[String]): Unit = {
    val intObj = new ComparInt(4,9)
    println(intObj.bigger)

    val longObj = new ComparLong(4L, 9L)
    println(longObj.bigger)

    println("----------------ComparComm------------------------------")
    val commObj = new ComparComm(Integer.valueOf(4),  Integer.valueOf(9))
    val commObj2 = new ComparComm[Integer](4, 9)
    //第三种方式：采用隐式转换
    val commObj3 = new ComparComm[Int](4, 9)
    println(commObj3.bigger)

    //Int
    //Interger
  }
}
