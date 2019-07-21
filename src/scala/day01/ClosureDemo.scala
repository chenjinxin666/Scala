package scala.day01

/**
  * 闭包的一个例子
  */
object ClosureDemo {
  //补贴
  val subsidy = 1000
  //年终奖+工资+补贴（每个部门的年终奖是不同的）
  def add(bonus:Double) = (wages:Double) =>wages+bonus+subsidy

  def main(args: Array[String]): Unit = {
    //春节，发年终奖
    //销售部门：10000
    //开发部门：15000
    //测试部门：8000
    val saleDept = add(10000) //销售部门的
    val boduo = saleDept(30000)
    val cang = saleDept(25000)

    println(boduo)

    val develorDept = add(15000)//开发部门的

    val testDept = add(8000)
  }
}
