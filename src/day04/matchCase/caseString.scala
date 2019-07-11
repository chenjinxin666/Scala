package day04.matchCase

import scala.util.Random

object caseString {
  def main(args: Array[String]): Unit = {
    val arr=Array("YoshizawaAkiho", "YuiHatano", "AoiSola")
    val i=Random.nextInt(arr.length)
    print(i+" ")
    arr(i) match {
      case "YoshizawaAkiho" => println("吉澤明步")
      case "YuiHatano" => println("波多野结衣")
      case _ => println("苍井空")
    }

  }
}
