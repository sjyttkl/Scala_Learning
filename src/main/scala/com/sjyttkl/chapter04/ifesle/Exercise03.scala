package com.sjyttkl.chapter04.ifesle

/**
  * Create with: com.sjyttkl.chapter04.ifesle 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/24 22:50 
  * version: 1.0
  * description:  
  */
object Exercise03 {
  def main(args: Array[String]): Unit = {
    var sumVal = 9
    val result =
      if(sumVal > 20){
        "结果大于20" //()
      }
    println("res =  " +result) //返回值是() 即 Unit
  }
}
