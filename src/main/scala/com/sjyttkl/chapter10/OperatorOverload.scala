package com.sjyttkl.chapter10

/**
  * Create with: com.sjyttkl.chapter10 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/23 15:44 
  * version: 1.0
  * description:  加减重载
  */
object OperatorOverload {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat + 10
    cat + 20
    cat.+(9)
    println("cat.age=" + cat.age)
  }
}

class Cat {
  var age = 0
  def +(n:Int): Unit = {
    this.age += n
  }
}
