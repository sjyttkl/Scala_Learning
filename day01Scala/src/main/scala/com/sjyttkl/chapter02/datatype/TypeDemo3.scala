package com.sjyttkl.chapter02.datatype

/**
  * Create with: com.sjyttkl.chapter02.datatype 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/24 10:58 
  * version: 1.0
  * description:  
  */
object  TypeDemo3 {
  def main(args: Array[String]): Unit = {
    println("Long的最大值"+Long.MaxValue +"~~"+Long.MinValue)

    var i = 10// i Int
    var j = 10l //j Long
    var e = 9223372036854775807l //说 9223372036854775807 超过int ,需要在后面加上  小写的L

    var f1:Float = 1.1f //默认为double类型，这样会报错,需要在后面接上 f 或者 F

    //2.2345678912f  , 2.2345678912
    var num1:Float = 2.2345678912f  //精度损失
    var num2:Double = 2.2345678912
    println("num1=" + num1 + "num2=" + num2)






  }
}
