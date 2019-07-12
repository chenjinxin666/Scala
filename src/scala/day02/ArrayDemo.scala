package main.scala.day02

import scala.collection.mutable.ArrayBuffer

/**
  * 可变数组和不可变数组
  * 不可变长数组：表示长度不可变，但是角标元素可变
  * 可变长数组：表示长度和角标元素都可变
  * 在scala中默认的数组都是不可变数组
  */
object ArrayDemo {

  def main(args: Array[String]): Unit = {

    /**
      * 不可边长数组一旦初始化以后，数组的长度不可变，但是内容可变
      * 在scala中Array初始化的时候并不是不需要new，而是Array实现了apply方法，该方法帮我们实现了new关键字
      */
    val arr = Array[Int](1, 2, 3, 4, 5)

    //快捷键 Alt+回车
    val arr2: Array[Any] = Array("hadoop", 1, 2, 3, 4, 5)

    //创建一个数组，给数组初始化一个长度为5， 每个角标的初始值和泛型的初始值一致，也就是0
    val arr3 = new Array[Int](5)

    //创建一个数组，数组的长度式1， 元素值式5
    val arr4 = Array[Int](5)

    //将两个数组的数据合并，并且返回一个新的数组，并没有改变原来的数组
    val arr5 = arr ++ arr4

    /**
      * 可变长数组
      * 如果实现可变长数组的话，需要显示的引入 scala.collection.mutable.ArrayBuffer
      */
    val buffer = ArrayBuffer[Int]()

    //如果式+= 符号，那么后面只能跟单个元素
    buffer.+=(1)
    buffer += 2 //(2, 3, 4)
    buffer += (3, 4)

    //++=后面不能添加单个元素，只能添加数组集合
    buffer ++= Array(5, 6, 7)
    buffer ++= ArrayBuffer(8, 9)

    //不能使用该方式添加元素，这种方式是修改下标对应的值
    //buffer(9) = 10
    buffer.append(10, 11)

    //删除一个元素
    buffer.-=(11)
    buffer.-=(9, 10)
    buffer.-=(9, 8)

    buffer --= Array(3, 4, 5)
    buffer.remove(0)

    println(buffer)

    /**
      * 数组常用的方法
      */
    val array = Array(1, 2, 3, 4, 5)
    //array.max
    println(array.max)
    array.min
    array.sum
    //将数组中的元素以指定字符串分割
    array.mkString(":")
    array.mkString("[", ":", "]")

    //排序
    array.sorted
    array.reverse
    array.sorted.reverse
    println(array.toBuffer)

    /**
      * 数组的转换操作
      */
    val inArr = Array(5, 3, 4, 6, 1)

    val fun1 = (x: Int) => x * 10
    inArr.map(x => fun1(x))
    inArr.map(fun1(_))
    inArr.map(fun1)

    inArr.map(x=>x*10)
    inArr.map(_*10)

    val inArr2 = Array("hadoop", "spark")
    inArr2.map(_.toUpperCase)

    inArr.map(_*5).sorted.reverse
    inArr.map(_*5).sortBy(x => x)
    //倒叙排序
    inArr.map(_*5).sortBy(x => -x)

  }
}
