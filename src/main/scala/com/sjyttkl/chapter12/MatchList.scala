package com.sjyttkl.chapter12

/**
  * Create with: com.sjyttkl.chapter12 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/12/3 20:39 
  * version: 1.0
  * description:   匹配list
  */
object MatchList {
  def main(args: Array[String]): Unit = {

    for (list <- Array(List(0), List(1, 0), List(88), List(0, 0, 0), List(1, 0, 0))) {
      val result = list match {
        case 0 :: Nil => "0" //list(0)  开头为0
        case x :: y :: Nil => x + " " + y //
        case 0 :: tail => "0 ..." //
        case x :: Nil => x
        case _ => "something else"
      }
      //1. 0
      //2. 1 0
      //3. 0 ...
      //4. something else
      println(result)
    }

  }
}
