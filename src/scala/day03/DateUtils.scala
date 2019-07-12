package main.scala.day03

import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.Calendar

/**
  * 一个简单的日期处理工具类
  */
object DateUtils {

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
