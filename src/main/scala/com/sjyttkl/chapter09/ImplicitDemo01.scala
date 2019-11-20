package com.sjyttkl.chapter09

/**
  * Create with: com.sjyttkl.chapter09 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/20 10:57 
  * version: 1.0
  * description:   隐式转换 ，  所有带有下划线表示用了隐式转换
  */
object ImplicitDemo01 {
  def main(args: Array[String]): Unit = {

    //编写一个隐式函数转成 Double->Int 转换
    //隐式函数应当在作用域才能生效
    implicit def f1(d:Double)={ //底层 生成 f1$1
      d.toInt
    }

    implicit  def f2(d:Float):Int={
      d.toInt
    }

     //这里我们必须保证隐式函数的匹配只能是唯一的.
//    implicit  def f3(d:Float):Int={
//      d.toInt
//    }
    // 底层编译 f1$1(3.5)
    val num :Int = 3.5  //带有下划线表示用了隐式转换
    println("num= " +num)
    val num2:Int = 6.7f
  }
}
