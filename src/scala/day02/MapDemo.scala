package scala.day02

import scala.collection._
import scala.collection.immutable.TreeMap
/**
  * 在scala中Map映射也是分为两种：可变长（mutable）和不可变长(immutable)
  */
object MapDemo {
  def main(args: Array[String]): Unit = {
    /**
      * 不可边长Map映射，长度和值一旦初始化不可能再次被改变
      */
    //通过对偶元祖的方式创建映射，对偶元祖：有两个参数的元祖
    val map0 = Map(("a", "A"), ("b", "B"))

    //通过箭头的方式创建映射
    val map1 = Map("a"->"A", "b"->"B")

    //两者进行混合创建Map映射
    val map2 = Map(("a", "A"), "b"->"B")

    //++只是将两个映射进行合并，原有的map映射并没有改变，同时也会去重，是根据Key值进行去重的
    val map3 = map0++map1

    //不可改变集合修改的时候报错
//    scala> map0("a") = "C"
//    <console>:15: error: value update is not a member of scala.collection.immutable.Map[String,String]
//      map0("a") = "C"
//      ^
    /**
      * 可变长Map映射，mutable包
      */
    val map4 = mutable.Map("a"->"A")
    map4("a") = "B"
    map4 += ("b" -> "B")
    map4 += (("c", "C"), ("d", "D"))
    //如果添加一个key重复的数据， 那么后面追加的会替换掉之前追加的
    map4 += ("d"-> "E")
    map4.put("e", "E")
    map4 ++= mutable.Map("j"->"J")

    //移除Map中的key
    map4 -= "a"
    map4.remove("b")

    val map5 = mutable.Map(1->"A")

    /**
      * 映射常用的操作方法
      */
    //判断一个key是否存在，如果存在返回true，否则返回false
    map4.contains("a")

    //映射的get方法也是用来获取key对应的值，但是这个方法返回的是一个option对象，这个option对象有两个子类
    //如果有key则返回Some（some对象中封装了key对应的的值）
    //如果没有key则返回None
    val value: Option[String] = map4.get("a")

    //这个方法可以用来判断some对象还是none对象
    map4.isEmpty

    //如果key存在，则返回key对应的value，否则返回默认值
    map4.getOrElse("f", "F")

    //根据key进行排序
    val treeMap  =  TreeMap("name"->"beijing", "address"->"beifang")

  }
}
