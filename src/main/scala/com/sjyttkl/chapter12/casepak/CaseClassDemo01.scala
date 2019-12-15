package com.sjyttkl.chapter12.casepak

/**
  * Create with: com.sjyttkl.chapter12.casepak 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/12/3 21:07 
  * version: 1.0
  * description:   样例类
  */
object CaseClassDemo01 {
  def main(args: Array[String]): Unit = {
    println("hello~~")
  }
}

abstract class Amount
case class Dollar(value: Double) extends Amount    //样例类 ，构造器中参数都是  val
case class Currency(value: Double, unit: String) extends Amount //样例类
case object NoAmount extends Amount  //样例类   obeject方法会少点。

