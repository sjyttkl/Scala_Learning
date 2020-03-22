package com.sjyttkl.chapter13

/**
  * Create with: com.sjyttkl.chapter13 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/22 23:16 
  * version: 1.0
  * description:  
  */
object HigherOrderFunction2 {
  def main(args: Array[String]): Unit = {
    //说明
    //1. minusxy是高阶函数,因为它返回匿名函数
    //2. 返回的匿名函数 (y: Int) => x - y
    //3. 返回的匿名函数可以使用变量接收

    def minusxy(x: Int) = {
      (y: Int) => x - y //匿名函数
    }

    //分步执行
    //f1 就是 (y: Int) => 3 - y
    val f1 = minusxy(3)
    println("f1的类型=" + f1)
    println(f1(1)) //  2
    println(f1(9)) //  -6

    //也可以一步到位的调用,函数柯里化
    println(minusxy(4)(9)) // -5
  }
}
