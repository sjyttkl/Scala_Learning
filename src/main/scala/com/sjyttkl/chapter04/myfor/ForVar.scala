package com.sjyttkl.chapter04.myfor

/**
  * Create with: com.sjyttkl.chapter04.myfor 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/24 23:36 
  * version: 1.0
  * description:  
  */
object ForVar {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3; j = 4-i){
      println(j +" ") // 3,2,1
    }
  }
}
