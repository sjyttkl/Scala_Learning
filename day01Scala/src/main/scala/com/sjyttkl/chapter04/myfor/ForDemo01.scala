package com.sjyttkl.chapter04.myfor

/**
  * Create with: com.sjyttkl.chapter04.myfor 
  * author: songdongdong  
  * E-mail: songdongdong@jd.com 
  * date: 2019/2/24 23:02 
  * version: 1.0
  * description:  
  */
object ForDemo01 {
  def main(args: Array[String]): Unit = {
    //输出10句 "hello,尚硅谷!"
    val start = 1
    val end = 10
    //说明
    //1. start 从哪个数开始循环
    //2. to 是关键字
    //3. end 循环结束的值
    //4. start to end 表示前后闭合
    for (i <- start to end) {

      println("你好，尚硅谷" + i)
    }

    //说明for 这种推导时，也可以直接对集合进行遍历
    var list = List("hello", 10, 30, "tom")
    for (item <- list) {
      println("item=" + item)
    }
    var attr_rule  = List[String]("监听性_降噪\t监听|降噪|静音|防噪|低噪\t降噪|静音|防噪|低噪","包覆_包覆度\t包覆|包裹性\t包覆|包裹|覆盖")
    for(item <- attr_rule){
      println(item)
    }
  }
}
