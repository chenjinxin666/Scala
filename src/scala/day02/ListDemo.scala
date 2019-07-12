package main.scala.day02

import scala.collection.mutable.ListBuffer

/**
  * 序列分为不可变长和可变长，序列起始就是list，底层是链表结构
  * 特点：插入有序，可以重复，增加和移除元素很快，查询慢
  * 不可边长序列：List
  * 可变长序列：ListBuffer
  */
object ListDemo {
  def main(args: Array[String]): Unit = {

    /**
      * 不可边长序列List，长度不可变，角标元素也不可变
      */
    val list0 = List(1,2,3,4,5)

    //list0(0) = 12
    //++ 并没有改变原有的list，只是将两个list序列进行了合并形成了一个新的list
    val list1 = list0 ++ List(6,7,8,9)
    println(list1.toBuffer)

    /**
      * 定义可变长序列
      */
    val lb0 = ListBuffer(1, 2)

    //+=或者-=后面只能跟一个单个的元素
    lb0.+=(3)
    lb0 += 4

    //++=或者--=后面只能跟一个序列List或者ListBuffer
    lb0 ++= List(5,6,7)
    lb0 --= ListBuffer(6,7)
    //追加元素
    lb0.append(6,7,8)
    //根据角标移除元素，重载了方法，第二个参数表示移除的个数，而不是下标
    lb0.remove(0,1)

    println(lb0)

    println("-------------------给list头部追加元素-------------------------")
    val list01 = List(4,5,6)
    //这里式将123进行拆分同list01进行合并
    val newList = List(1,2,3) ++ list01 //List(1,2,3,4,5,6)

    /**
      * 给list尾巴添加元素
      */
    val list02 = List(4,5,6)
    //这里是将（7，8，9）作为整体同list02进行合并，并添加到尾巴，形成一个新的list
    val newList02 = list02.:+(7,8,9)
    val newList03 = list02 ++ List(7, 8, 9)
    println(newList03)

    /**
      * 序列的常用操作方法
      */
    val lt = List(1,2,3,4,5)
    lt.sum
    lt.max
    lt.min
    lt.head
    lt.tail
    lt.last //最后一个元素，如果只有一个元素，头=尾巴
    lt.reverse
    lt.mkString(":")
    lt.mkString("[", ":", "]")

    /**
      * 序列的转换操作
      */
    println("序列的转换操作")
    val list = List(1,2,8,4,5,9)

    val f01 = (x:Int) => x%2==0
    //需求：找到乘以10以后的偶数
    //def filter(p: A => Boolean): Repr = filterImpl(p, isFlipped = false)
    list.map(_*3).filter(f01)
    list.map(_*3).filter(_%2==0).sortBy(x=>x)
  }
}
