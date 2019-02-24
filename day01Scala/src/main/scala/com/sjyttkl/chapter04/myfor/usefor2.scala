package com.sjyttkl.chapter04.myfor

/**
  * Create with: com.sjyttkl.chapter04.myfor 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/24 23:43 
  * version: 1.0
  * description:  
  */
object usefor2 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j = i * 2) {
      println(" i= " + i + " j= " + j)
    }

    //等价
    println("------------------------")
    for {
      i <- 1 to 3
      j = i * 2} {
      println(" i= " + i + " j= " + j)
    }

  }
}
