package scala.day04.casedemo

import scala.util.Random

/**
  * 匹配字符串
  */
object CaseDemo01 {
  def main(args: Array[String]): Unit = {
    val arr = Array("YoshizawaAkiho", "YuiHatano", "AoiSola")

    val i = Random.nextInt(arr.length)
    println(i)
    val name = arr(i)
    name match {
      case "YoshizawaAkiho" => println("吉泽老师")
      case "YuiHatano" => println("波多老师")
      case _ => println("不知道你们在说什么")
    }

  }
}
