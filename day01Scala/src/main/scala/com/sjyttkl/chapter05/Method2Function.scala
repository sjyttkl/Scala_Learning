package com.sjyttkl.chapter05

/**
  * Create with: com.sjyttkl.chapter05 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/25 20:39 
  * version: 1.0
  * description:  
  */
object Method2Function {
  def main(args: Array[String]): Unit = {

    //使用方法
    //先创建一个对象
    val dog = new Dog
    println(dog.sum(10,32))

    //方法转成函数
    val f1 = dog.sum _
    println("f1 = " + f1)
    println("f1 = " + f1(50,60))

      //函数，求和
    val f2 = (n1:Int,n2:Int)=> {
      n1+n2
    }
    println("f2 = " + f2)
    println("f2 = " + f2(5,6))
  }

}
class Dog
{
  //方法
  def sum(n1:Int,n2:Int):Int =
  {
     n1 + n2
  }

}
