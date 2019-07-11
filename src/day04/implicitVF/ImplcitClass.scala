package day04.implicitVF

//特殊人群
class SpecialPerson(var name: String, var age: Int)

//老人
class Older(var name: String)

//学生
class Student04(var name: String)

//教师
class Teacher04(var name: String)

object ImplcitClass {
  def specialWindos(p: SpecialPerson) = {
    if (p == null) {
      println("这里是特殊窗口")
    } else {
      println(s"name:${p.name} age:${p.age},购买了一张票")
    }
  }

  def main(args: Array[String]): Unit = {
    val p1 = new Older("局座")
    val p2 = new Student04("千手")
    val p3 = new Teacher04("苍井空")

    import implicitFunction._
    specialWindos(p1)
    specialWindos(p2)
    specialWindos(p3)
  }
}
