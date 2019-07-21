package scala.day04

object MyPredef {

  /**
    * 定义一个隐式转换方法，将传入的类型转换成特殊群体
    * @param any
    * @return
    */
  implicit def any2SpecialPerson(any:Any):SpecialPerson = {
    if(any.isInstanceOf[Older]){
      val older = any.asInstanceOf[Older]
      new SpecialPerson(older.name, 78)
    } else if(any.isInstanceOf[Student04]){
      val student = any.asInstanceOf[Student04]
      new SpecialPerson(student.name, 14)
    } else { null }
  }
}
