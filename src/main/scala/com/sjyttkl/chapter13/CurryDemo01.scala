package com.sjyttkl.chapter13

/**
  * Create with: com.sjyttkl.chapter13 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/22 23:46 
  * version: 1.0
  * description: 函数柯里化
  * 1. 函数编程中，接受多个参数的函数都可以转化成接受多个参数列表的函数，
  *   这个转化工程就是柯里化
  * 2.柯里化就是证明了函数只需要一个参数而已，
  * 3. 不用设立柯里化存在的意义这样命题。
 *
 * scala里Curry化可以把函数从接收多个参数转换成多个参数列表，如果要用同样的一组实参多次调用一个函数，可以用curry来减少噪音
 *
 * 也就是说，写的不是def foo(a:Int,b:Int,c:Int){} ,而是def foo(a:Int)(b:Int)(c:Int){}。可以这样调用这个方法，比如：foo(1)(2)(3)、foo(1){2}{3},甚至foo{1}{2}{3}

  *
  */
object CurryDemo01 {
  def main(args: Array[String]): Unit = {
    def mulCurry2(x: Int)(y: Int) = x * y

    println(mulCurry2(10)(8))
  }
}
