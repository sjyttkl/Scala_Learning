package com.sjyttkl.chapter14

/**
  * Create with: com.sjyttkl.chapter14 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/23 9:43 
  * version: 1.0
  * description:  
  */
object RecursiveReverseString {
  def main(args: Array[String]): Unit = {
    val str  = "abcdefg"
    println(reverse(str))
  }

  //使用地推完成对字符串的翻转
  def reverse(xs: String): String = {
    if (xs.length == 1) {//如果长度为1 则返回
      xs
    }
    else {
      reverse(xs.tail) + xs.head //如果长度>1  就是直接执行
    }
  }
}
