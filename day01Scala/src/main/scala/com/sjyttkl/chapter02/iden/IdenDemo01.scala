package com.sjyttkl.chapter02.iden

/**
  * Create with: com.sjyttkl.chapter02.iden 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/24 12:24 
  * version: 1.0
  * description:  
  */
object IdenDemo01 {
  def main(args: Array[String]): Unit = {
    //首字符为操作符(比如+ - * / )，后续字符也需跟操作符 ,至少一个
    val ++ = "Hello word"
    println(++)

    val -+*/ = 90
    println("res = " + -+*/)

    //看看编译器怎么处理这个问题
    // ++  => $plus$plus

    //val +q = "abc" //error

    //用反引号`....`包括的任意字符串，即使是关键字(39个)也可以

    var `true` = "hello,scala!"
    println("内容=" + `true`)

    val Int = 90.45
    println("Int=" + Int)

    //不能使用_ 做标识符
    //    var _ = "jack"
    //    println(_)

  }
}
