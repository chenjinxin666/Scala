package day01

object IFTest {
  def main(args: Array[String]): Unit = {
    val age = 60;
    if(age<30)println("成长期")
    else if(age<60)println("成熟期")
    else println("老年期")
  }
}
