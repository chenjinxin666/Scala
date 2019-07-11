package day03.object_class_java

import java.text.SimpleDateFormat
import java.util.Calendar

object JavaDataUtils {
  def getCurrentDate = getCurrentDateTime("yyyy-MM-dd")
  def getCurrentTime:String = getCurrentDateTime("K:m aa")

  /**
    * 定义一个日期处理方法，该方法不能对外直接提供服务
    * @param dateTimeFormatter
    * @return
    */
  private def getCurrentDateTime(dateTimeFormatter: String) :String={
    val dateFormat = new SimpleDateFormat(dateTimeFormatter)
    val cal = Calendar.getInstance()
    dateFormat.format(cal.getTime)
  }
}
