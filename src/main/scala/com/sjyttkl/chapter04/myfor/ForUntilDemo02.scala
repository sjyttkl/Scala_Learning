package com.sjyttkl.chapter04.myfor

/**
  * Create with: com.sjyttkl.chapter04.myfor 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/24 23:14 
  * version: 1.0
  * description:  
  */
object ForUntilDemo02 {
  def main(args: Array[String]): Unit = {
    //输出10句，“hello,尚硅谷"
    val start = 1
    val end = 11
    //循环的范围是  start --- (end-1)
    for(i <- start until end){
      println("hello, 尚硅谷" + i)
    }
  }

}
