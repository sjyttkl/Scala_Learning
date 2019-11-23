package com.sjyttkl.chapter10

/**
  * Create with: com.sjyttkl.chapter10 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/21 12:52 
  * version: 1.0
  * description:  
  */
object CollectionDemo01 {
  def main(args: Array[String]): Unit = {
    val str = "hello"//字符串在scala就是Char的集合 IndexedSeq
    for(item <- str){
      println(item)
    }
    println(str(2))
  }
}
