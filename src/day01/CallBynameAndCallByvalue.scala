package day01

object CallBynameAndCallByvalue {
  //钱包总金额
  var money = 100
  /**
    * 刷卡，每次刷5元
    */
  def shuaka():Unit = {
    money = money -5
  }
  /**
    * 数钱， 看看卡里还剩下多少余额
    */
  def shuqian() ={
    println(money)
    shuaka()
    money
  }
  /**
    * call by Value操作
    * @param x
    */
  def printByValue(x:Int) ={
    for (i<- 0 until 3){
      println(s"测试：${x}元")
    }
  }
  /**
    * call by name操作
    * @param x
    */
  def  printByName(x: => Int) ={
    for (i<- 0 until 5){
      println(s"测试：${x}元")
      println("............")
    }
  }

  def main(args: Array[String]): Unit = {
    //1：计算数钱返回值：95
    //2: 将95作为参数传入printByValue
    println("*****************传值调用****************************")
    printByValue(shuqian())

    //1: 将shuqian方法名称传递到方法的内部执行
    println("*****************传名调用****************************")
    printByName(shuqian())

    //总结：传值调用-》先计算再传参
    //      传名调用-》先传参再计算（用到了才计算）

  }
}
