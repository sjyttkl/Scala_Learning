package com.sjyttkl.chapter13

/**
 * Create with: com.sjyttkl.chapter13
 * author: sjyttkl
 * E-mail: 695492835@qq.com
 * date: 2020/3/22 23:46
 * version: 1.0
 * description: 函数柯里化
 * 1. 函数编程中，接受多个参数的函数都可以转化成接受多个参数列表的函数，
 * 这个转化工程就是柯里化
 * 2.柯里化就是证明了函数只需要一个参数而已，
 * 3. 不用设立柯里化存在的意义这样命题。
 *
 * scala里Curry化可以把函数从接收多个参数转换成多个参数列表，如果要用同样的一组实参多次调用一个函数，可以用curry来减少噪音
 * -------也可以这么认为：柯里化(Currying)指的是把原来接受多个参数的函数变换成接受一个参数的函数过程，并且返回接受余下的参数且返回结果为一个新函数的技术。
 * 也就是说，写的不是def foo(a:Int,b:Int,c:Int){} ,而是def foo(a:Int)(b:Int)(c:Int){}。可以这样调用这个方法，比如：foo(1)(2)(3)、foo(1){2}{3},甚至foo{1}{2}{3}
 *
 *
 */
object CurryDemo01 {
  //这种写法表示，first(x)是一个函数返回 一个匿名函数
  def first(x: Int) = (y: Int) => {
    x + y
  }

  def curriedSum(x: Int)(y: Int) = x + y

  def mulCurry2(x: Int)(y: Int) = x * y

  def main(args: Array[String]): Unit = {


    println(mulCurry2(10)(8))

    val r = first(3)
    println(r(3))

    println(first(10)(10))

    //curriedSum 下划线“_” 作为第二参数列表的占位符， 这个定义的返回值为一个函数，当调用时会给调用的参数加一。
    val f = curriedSum(3) _
    println(f(4))
  }
}
