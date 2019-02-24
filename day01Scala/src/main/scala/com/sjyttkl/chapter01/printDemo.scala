package com.sjyttkl.chapter01

/**
  * Create with: com.sjyttkl.chapter01 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/17 23:54 
  * version: 1.0
  * description:  
  */
object printDemo {
  def main(args: Array[String]) :Unit = {
    var str1 :String = "Hello"
    var str2 :String = "world"
    print(str1+str2)
    var name:String = "song"
    var age:Int =20
    var sal:Float=10.67f
    var height:Double = 180.32
    //格式化输出
    printf("名字= %s年龄%d 薪水%.2f 高.3f",name,age,sal,height)

    //scala 支持使用$输出内容，编译器会去解析$对应变量
    println(s"\n个人信息如下：\n名字 $name \n 年龄 $age \n 薪水 $sal")
    //{}中是一个表达式。
    println(s"\n个人信息如下：\n名字 ${name} \n 年龄 ${age} \n 薪水 ${sal*20}")
  }
}
