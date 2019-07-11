package day01
import scala.util.control.Breaks._
object WhileTest {
  def main(args: Array[String]): Unit = {
    var n=0
    do{
      print(n)
      n+=1
    }while(n<0)
    println()

    var f=true
    while(f){
      if(n>4)f= !f
      print(n+" ")
      n+=1
    }
    println()

    breakable({
      while(true){
        if(n>10)break()
        print(n+" ")
        n+=1
      }
    })
  }
}
