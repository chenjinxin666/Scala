package scala.day01

object MethodDemo {

  /**
    * 根据方法体的最后一句话作为返回值类型，方法体最后一句不需要return
    * @param x
    * @param y
    * @return
    */
  def m(x:Int, y:Int) = {
    "abcd"
    x*y
  }

  /**
    * 如果显式指明方法没有返回值，那么即使方法体最后一句右返回，整个方法也不会有返回值
    * @param x
    * @param y
    */
  def m2(x:Int, y:Int):Unit ={
    x*y
  }

  /**
    * 如果定义的方法有返回值，那么再方法中一定要有返回值，否则语法报错
    * @param x
    * @param y
    * @return
    */
//  def m3(x:Int, y:Int):Int ={
//    println(x*y)
//  }

  def m4(name:String, age:Int = 30, sex:String="女"): Unit ={
    println(s"name:${name}, age:${age}, sex:${sex}")
  }

  /**
    * 变长参数
    * @param nums
    * @return
    */
  def sum(nums: Int*) = {
    var res = 0
    for (num <- nums)
      res += num
    res
  }

  def main(args: Array[String]): Unit = {
    println(m(2, 5))

    m4("苍老师", 20)

    m4("波多老师")

    m4(name = "泷泽", sex = "女")

    println(sum(1,2,3,4,5))
  }
}
