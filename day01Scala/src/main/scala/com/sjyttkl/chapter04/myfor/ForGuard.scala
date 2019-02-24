package com.sjyttkl.chapter04.myfor

/**
  * Create with: com.sjyttkl.chapter04.myfor 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/24 23:33 
  * version: 1.0
  * description:  
  */
object ForGuard {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3 if i!=2){
      println(i + " " ) //1 3
    }
  }
}
