package day04

object curring {
  def add0(a: Int, b: Int): Int = {
    a + b
  }

  def add1(a: Int)(b: Int): Int = {
    a + b
  }

  def main(args: Array[String]): Unit = {
    println(add0(1,2))

    println(add1(1)(2))
    val tmp=add1(1)_
    println(tmp(2))

  }
}
