package main.scala.day02

import main.scala.day03.Teacher

/**
  * scala中元祖使用括号表示获取元祖中的值使用下划线标示，角标从1开始
  * 目前的版本支持最多22个参数的元祖，一元组类是存在的,但是没有对应的内建语法，因此单纯的用括号将一个值包含起来没什么卵用，零元祖也是存在的，就是Unit
  * 元祖有什么用？
  * 假如有一个类，类中定义了很多属性，而你没有修改该类的权限，但是又想增加一个或者多个属性返回的话，可以将属性和类包含在一个元祖里面作为整体返回
  *
  */
object TupleDemo {

  def main(args: Array[String]): Unit = {
    //定义一个元祖
    val t1 = ("苍老师", "女", 30)

    //元祖的下角标是从1开始的
    println(s"赵毅的女神：${t1._1}, 性别：${t1._2}， 年龄:${t1._3}")

    //这个就是对偶元祖
    val t2 = ("id", "123")

    //可以将元祖的元素单独赋值给对应的变量
//    val (name, sex, age) = t1
//    println(s"赵毅的女神：${name}, 性别：${sex}， 年龄:${age}")

    val t3, (name, sex, age) = t1
    println(t3)
    println(s"赵毅的女神：${name}, 性别：${sex}， 年龄:${age}")

    //拉链操作
    val arr1 = Array("a", "b", "c", "d")
    val arr2 = Array("A", "B", "C", "D")

    val tuples = arr1.zip(arr2)
    println(tuples)

  }
}
