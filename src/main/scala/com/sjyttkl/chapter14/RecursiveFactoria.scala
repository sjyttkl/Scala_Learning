package com.sjyttkl.chapter14

/**
  * Create with: com.sjyttkl.chapter14 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/23 9:48 
  * version: 1.0
  * description:   递归阶乘
  */
object RecursiveFactoria {
  def main(args: Array[String]): Unit = {
    println(factorial(5))
  }

  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
  }
}
