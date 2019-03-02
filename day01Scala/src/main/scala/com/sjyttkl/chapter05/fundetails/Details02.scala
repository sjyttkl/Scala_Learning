package com.sjyttkl.chapter05.fundetails

object Details02 {
  def main(args: Array[String]): Unit = {

    println(getSum2(10, 30)) // ()

    println(getSum4(9, 9)) //()

  }

  //如果写了return ,返回值类型就不能省略
  def getSum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

  //如果返回值这里什么什么都没有写，即表示该函数没有返回值
  //这时return无效
  def getSum2(n1: Int, n2: Int) {
    return n1 + n2
  }

  def getSum4(n1: Int, n2: Int) = {//无返回值，或者不确定返回值的时候，可以这么干，但是不能写return
    n1 + n2

    //    return n1+n2 // //这样写会报错
  }

  //如果函数明确声明无返回值（声明Unit），那么函数体中即使使用return关键字也不会有返回值
  def getSum3(n1: Int, n2: Int): Unit = {
    return n1 + n2
  }
}

