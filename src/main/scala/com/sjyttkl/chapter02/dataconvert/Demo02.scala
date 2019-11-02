package com.sjyttkl.chapter02.dataconvert

/**
  * Create with: com.sjyttkl.chapter02.dataconvert 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/24 12:23 
  * version: 1.0
  * description:  
  */
object Demo02 {
  def main(args: Array[String]): Unit = {
    val num1 :Int = 10 *3.5.toInt + 6*1.5.toInt
    val num2 :Int = (10*3.5+6*1.5).toInt

    println(num1 +"  " + num2)

    val char1 :Char = 1
    val num3 =1

//    val char2 :Char = num3//错误
  }
}
