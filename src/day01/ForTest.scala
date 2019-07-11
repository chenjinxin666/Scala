package day01

import scala.util.control.Breaks._

object ForTest {
  def main(args: Array[String]): Unit = {
    for(i<- 1 to 9)print(i+" ")
    println()
    for(i<- 1 until 9)print(i+" ")
    println()
    for(i<- "asd")print(i+" ")
    println()
    for(i<- 1 to 9 ; j<- 1 to i){
      print(j+"*"+i+"="+i*j+"\t")
      if(i==j)println()
    }
    println()
    for(i<- 1 to 9 ; if(i%2==1))print(i+" ")
    println()
    var a=1
    var b=1
    val v =for(i<- 1 to 5)   yield i*10
    println(v)
    println()
    var flag=true
    var flag2=true
    for(i<-1 to 9;if(flag)){
      print(i+" ")
      if(i==5)flag2 = ! flag
    }
    println()
    breakable({
      for(i<-1 to 9){
        print(i+" ")
        if(i==5) break()
      }
    })

  }
}
