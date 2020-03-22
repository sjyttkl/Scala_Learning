package com.sjyttkl.chapter13

/**
  * Create with: com.sjyttkl.chapter13 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/22 22:07 
  * version: 1.0
  * description:  
  */
object FunParameter {
  def main(args: Array[String]): Unit = {
    def plus(x: Int) = 3 + x
    //
    val result = Array(1,2,3,4).map(x => plus(x))
    val result2 = Array(2,3,4,5).map(plus(_))
    //说明
    //1. 在scala中，函数也是有类型，比如plus就是 <function1>
    println(result.mkString(","))
    println(result2.mkString(","))
    println("puls的函数类型function1" + (plus _))

  }

}
