package com.sjyttkl.chapter12

/**
  * Create with: com.sjyttkl.chapter12 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/24 22:54 
  * version: 1.0
  * description:  守卫
  */
object MatchExercise02 {
  def main(args: Array[String]): Unit = {

    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case _ if ch > 10000  => digit = 3 //这里不是默认匹配
        case '+' => sign = 1
        case '-' => sign = -1
        // 说明..
        case _ => println("没有任何匹配~~~")
      }
      println(ch + " " + sign + " " + digit)
    }


  }
}
