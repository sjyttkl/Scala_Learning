package com.sjyttkl.chapter13

/**
  * Create with: com.sjyttkl.chapter13 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/23 0:10 
  * version: 1.0
  * description:  抽象控制实现
  */
object AbstractControl2 {
  def main(args: Array[String]): Unit = {
    var x = 10

    //说明
    //1 函数名为 until , 实现了类似 while循环的效果
    //2. condition: => Boolean 是一个没有输入值，返回Boolean类型函数
    //3. block: => Unit 没有输入值，也没有返回值的韩
    def mywhile(condition: => Boolean)(block: => Unit): Unit = {
      //类似while循环，递归
      if(!condition) {
        block // x= 9 ,x = 8 x =7 ....
        mywhile(condition)(block)
      }

    }


    mywhile(x == 0) {
      x -= 1
      println("x=" + x )
    }

  }
}
