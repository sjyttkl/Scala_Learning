package com.sjyttkl.chapter13

/**
  * Create with: com.sjyttkl.chapter13 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/22 23:52 
  * version: 1.0
  * description:  
  */
object CurryDemo02 {

  //这是一个函数，可以接收两个字符串，比较是否相等
  def eq(s1: String, s2: String): Boolean = {
    s1.equals(s2)
  }

  //隐式类
  implicit class TestEq(s: String) {
    //体现了将比较字符串的事情，分解成两个任务完成
    //1. checkEq 完转换大小写
    //2. f函数完成比较任务
    def checkEq(ss: String)(f: (String, String) => Boolean): Boolean = {
      f(s.toLowerCase, ss.toLowerCase)
    }
  }

  val str1 = "hello"
  println(str1.checkEq("HeLLO")(eq))

  //在看一个简写形式
  println(str1.checkEq("HeLLO")((s1:String,s2:String)=>s1.equals(s2)))
  println(str1.checkEq("HeLLO")((s1,s2)=>s1.equals(s2)))
  println(str1.checkEq("HeLLO")(_.equals(_)))

 //简单的方式
  println(eq2("l")("L"))
  def eq2(s1: String)(s2: String): Boolean = {
    s1.toLowerCase == s2.toLowerCase
  }
}
