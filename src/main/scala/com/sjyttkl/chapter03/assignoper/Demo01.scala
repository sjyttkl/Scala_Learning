package com.sjyttkl.chapter03.assignoper

/**
  * Create with: com.sjyttkl.chapter03.assignoper 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/24 16:37 
  * version: 1.0
  * description:  
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    var num = 2
    num <<= 2 //num = 8
    num >>= 1 // num =4
    println("num="+num)
    //在scala中支持代码块，返回值

    val res = {
      if (num > 1) "Hello ok " else 100
    }
    println("res = "+res)
    //有两个变量，a和b，要求将其进行交换，但是不允许使用中间变量，最终打印结果
    var a = 10
    var b = 20
    a = a + b
    b = a - b //====> (a+b) -b =a
    a = a - b //===>(a+b) -a = b

  //位运算。。。
  }
}
