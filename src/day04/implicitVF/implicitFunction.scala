package day04.implicitVF

object implicitFunction {
  implicit def any2SpecialPerson(any: Any): SpecialPerson = {
    if (any.isInstanceOf[Older]) {
      val older = any.asInstanceOf[Older]
      new SpecialPerson(older.name, 78)
    } else if (any.isInstanceOf[Student04]) {
      val stu = any.asInstanceOf[Student04]
      new SpecialPerson(stu.name, 12)
    }else{
      null
    }
  }
}
