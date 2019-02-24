package com.sjyttkl.chapter04.myfor

/**
  * Create with: com.sjyttkl.chapter04.myfor 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/24 23:37 
  * version: 1.0
  * description:  
  */
object MultiFor {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3; j <- 1 to 3) {
      println(" i =" + i + " j = " + j) //输出即句 9
    }

    //上面的写法，可以写成
    println("--------------------------")
    for(i <- 1 to 3) {
      for (j <- 1 to 3) {
        println(" i =" + i + " j = " + j) //输出即句 9
      }
    }
  }
}
