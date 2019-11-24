package com.sjyttkl.chapter11

/**
  * Create with: com.sjyttkl.chapter11 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/24 0:04 
  * version: 1.0
  * description:  
  */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice","Bob","Nick")
    val names2 = names.map(upper _)
    print("names =  "+names2)
  }
  def upper(s:String):String={
    s.toUpperCase
  }
}
