package day05.viewBound

/*class ComparComm1[T<:Comparable[T]](o1:T,o2:T){
  def bigger = if(o1.compareTo(o2)>0)o1 else o2
}
报错
*/

class ComparComm[T<%Comparable[T]](o1:T,o2:T){
  def bigger = if(o1.compareTo(o2)>0)o1 else o2
}
object ViewBound {
  def main(args: Array[String]): Unit = {
    println(new ComparComm[Int](1,2).bigger)
  }
}
