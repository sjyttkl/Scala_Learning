package com.sjyttkl.chapter11

/**
  * Create with: com.sjyttkl.chapter11 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/23 23:38 
  * version: 1.0
  * description:  
  */
object HighOrderFunDemo01 {
  def main(args: Array[String]): Unit = {

    //使用高阶函数
    val res  = test(sum2 _,3.5)
    println("res=" + res)


    //在scala中，可以把一个函数直接赋给一个变量,但是不执行函数,。需要加一个 _  下划线
    val f1 = myPrint _
    f1() //执行
  }
  def myPrint(): Unit = {
    println("hello,world!")
  }

  //说明
  //1. test就是一个高阶函数
  //2. f: Double => Double 表示一个函数， 该函数可以接受一个Double,返回Double
  //3. n1: Double 普通参数
  //4. f(n1) 在test函数中，执行 你传入的函数
  def test(f: Double => Double, n1: Double) = {
    f(n1)
  }

  //普通的函数, 可以接受一个Double,返回Double
  def sum2(d: Double): Double = {
    println("sum2被调用")
    d + d
  }
}
