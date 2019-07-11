package day01

object CallByName {
  var a=1
  var b=1
  def fibnq():Int={
    var c=a+b
    a=b
    b=c
    c
  }
  def printfn(n: => Int):Unit={
    for(i <- 1 to 5){
      println(n)
    }
  }
  def printfv(n:Int):Unit={
    for(i <- 1 to 5){
      println(n)
    }
  }
  def main(args: Array[String]): Unit = {
    printfn(fibnq())
    printfv(fibnq())
  }
}
