package main.scala.day02

import scala.collection.{mutable, _}
/**
  * Set Demo
  * 在scala中set集合分为可变长和不可变长
  * Set集合的特点：不重复无序
  */
object SetDemo {
  def main(args: Array[String]): Unit = {

    /**
      * 定义一个不可变长Set集合
      */
    val set0 = Set(1,2,3,4,5)
    //++并没有改变原有的set集合，只是将两个set进行合并返回一个新的Set集合
    val set1 = set0 ++ Set(5, 6,7,8,9)

    println(set1)

    /**
      * 可变长set集合
      */
    val set2 = mutable.Set(1, 3)

    //+=或者-=后面只能是单个元素
    set2 += 2

    //++=或者--=后面只能是set集合
    set2 ++= Set(5,6,7)

    /**
      * set常用的操作方法
      */

    set2.mkString(":")

    //获取set的长度
    set2.size

    //获取第一个元素
    set2.head

    //注意：set添加或者追加元素的时候，会重新打乱原有顺序，但是读取的时候不会打乱顺序
    set2.last

    set2.max
    set2.min
    set2.sum

    /**
      * set的转换操作
      */
    set2.map(_*2)

    set2.map(_*2).filter(x=>x>2).foreach(println)

    /**
      * foreach和map的区别
      * foreach无返回值
      * map有返回值
      */

    val treeSet = mutable.TreeSet(2,1,4,3,6)
    println(treeSet)

    val arr = Array(1,2,5,7,10)
    arr.reduce((x, y) => x-y)
  }
}
