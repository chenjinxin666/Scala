package scala.day03

object TestTeacher {
  def main(args: Array[String]): Unit = {
//    val teacher = new Teacher("苍老师", 35)
//    teacher.sex = "女"
//    println(s"大家的启蒙老师：${teacher.name}, 编号：${teacher.id}, 性别：${teacher.sex}，年龄：${teacher.age}")

    val teacher2 = new Teacher("波多老师", 30, "女")
    println(s"曹展的启蒙老师：${teacher2.name}, 编号：${teacher2.id}, 性别：${teacher2.sex}，年龄：${teacher2.age}")

//    val teacher3 = new Teacher("吉泽老师", 28, "女", "日本省")
//    println(s"鹏鹏的启蒙老师：${teacher3.name}, 编号：${teacher3.id}, 性别：${teacher3.sex}，年龄：${teacher3.age}")

  }
}
