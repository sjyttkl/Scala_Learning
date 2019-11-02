package com.sjyttkl.chapter02.datatype

/**
  * Create with: com.sjyttkl.chapter02.datatype 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/24 10:57 
  * version: 1.0
  * description:  
  */
object TypeDemo2 {
  def main(args: Array[String]): Unit = {
    println(sayHello)

    var num = 1.2//默认为double
    var num2 = 1.7f//这是一份float
//    num2 = num //error
    num2 = num.toFloat//这样就正确了
  }
  //比如开发中，我们有一个方法，就会异常中断，这时就可以返回Nothing
  //即当我们Nothing做返回值，就是明确说明该方法没有没有正常返回值
  def sayHello:Nothing={
    throw new Exception("抛出异常")
  }
}
