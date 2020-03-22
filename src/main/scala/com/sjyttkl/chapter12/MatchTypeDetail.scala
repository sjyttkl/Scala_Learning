package com.sjyttkl.chapter12

/**
  * Create with: com.sjyttkl.chapter12 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/26 14:12 
  * version: 1.0
  * description:  match类型匹配细节
  */
object MatchTypeDetail {
  def main(args: Array[String]): Unit = {

    val obj = 10
    val result = obj match {
      case a: Int => a
//      case b: Map[String, Int] => "Map集合"  //这里会报错  编译器觉得可能出现不会匹配的结果，则报错
      case _ => "啥也不是"
    }

  }
}
