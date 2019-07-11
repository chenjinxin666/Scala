package day02
import scala.collection.mutable.ListBuffer
object LiatTest {
  def main(args: Array[String]): Unit = {
    val list0=List(1,2,3,4,5)
    val list1=list0 ++ List(6,7,8)
    println(list0)

    val lb0=ListBuffer(1,2)
    lb0.+=(3)
    lb0 += 4

    lb0 ++= List(5,6,7)
    lb0 --= ListBuffer(6,7)

    lb0.append(6,7,8)

    lb0.remove(1,2)

    println(lb0)

    val list01 =List(4,5,6)
    val newList = List(1,2,3) ++ list01
    val newLIst02 = newList.:+(7,8)
    val newLIst03 = newList ++ List(9,10)
    println(newList)
    println(newLIst02)
    println(newLIst03)

  }
}
