package day01

object Functiontest {
  def f(x:Int,y:Int): Int ={
    "asd"
    x+y
  }
  def p(name:String,age:Int=0,sex:String="女"): Unit ={
    println(name+" "+age+" "+sex+"")
  }
  def sum(nums:Int*)={
    var s=0
    for(n<- nums){
      s+=n
    }
    s
  }
  def main(args: Array[String]): Unit = {
    print(f(2,3))
    println()
    p("a")
    p("a",20)
    p("a",12,"男")
    println(sum(1,2,3))
  }
}
