package com.sjyttkl.chapter12

/**
  * Create with: com.sjyttkl.chapter12 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/12/3 21:06 
  * version: 1.0
  * description:  
  */
object MidCase {
  def main(args: Array[String]): Unit = {
    List(1, 3, 5, 9) match { //修改并测试
      //1.两个元素间::叫中置表达式,至少first，second两个匹配才行.
      //2.first 匹配第一个 second 匹配第二个, rest 匹配剩余部分(5,9)
      case first :: second :: rest => println(first + " " + second  + " "+ rest.length + " " + rest) //
      case _ => println("匹配不到...")
    }

  }
}
