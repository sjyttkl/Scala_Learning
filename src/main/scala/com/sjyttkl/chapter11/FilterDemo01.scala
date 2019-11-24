package com.sjyttkl.chapter11

/**
  * Create with: com.sjyttkl.chapter11 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/11/24 0:10 
  * version: 1.0
  * description:  过滤，将符合要求的存到新集合中
  */
object FilterDemo01 {
  def main(args: Array[String]): Unit = {
    /*
      选出首字母为A的元素
       */
    val names = List("Alice", "Bob", "Nick")
    val names2 = names.filter(startA)
    println("names=" + names)
    println("names2=" + names2)
  }

  def startA(str:String): Boolean = {
    str.startsWith("A")
  }
}
