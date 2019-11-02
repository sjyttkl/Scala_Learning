package com.sjyttkl.chapter01

/**
  * Create with: com.sjyttkl.chapter01 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/17 22:20 
  * version: 1.0
  * description:  
  */
//只要以后看到有 object TestScala ，你应该有这样一个认识
//1. object TestScala 对应的是一个  TestScala$的一个静态对象 MODULE$
//2. 在我们的程序中，是一个单例
object TestScala {
  def main(args:Array[String]) :Unit={
    println("hello , sclaa ,idea..")
  }
}
