package com.sjyttkl.chapter11

/**
  * Create with: com.sjyttkl.chapter11 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/24 0:07 
  * version: 1.0
  * description:  扁平化
  */
object FlatMapDemo01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")

    //需求是将List集合中的所有元素，进行扁平化操作，即把所有元素打散
    val names2 = names.flatMap(upper _)
    println("names2=" + names2)

  }
  def upper( s : String ) : String = {
    s. toUpperCase
  }
}
