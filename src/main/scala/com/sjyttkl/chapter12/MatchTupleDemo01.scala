package com.sjyttkl.chapter12

/**
  * Create with: com.sjyttkl.chapter12 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/12/3 20:44 
  * version: 1.0
  * description:  匹配元组
  */
object MatchTupleDemo01 {
  def main(args: Array[String]): Unit = {
    //如果要匹配 (10, 30) 这样任意两个元素的对偶元组，应该如何写
    for (pair <- Array((0, 1), (1, 0), (10, 30), (1, 1), (1, 0, 2))) {
      val result = pair match { //
        case (0, _) => "0 ..." //以0开头的二元组，
        case (y, 0) => y // 以0结尾的二元组
        case (x, y) => (y, x) //"匹配到(x,y)" + x + " " + y
        case _ => "other" //.
      }
      //1. 0 ...
      //2. 1
      //3. other
      //4. other
      println(result)
    }

  }
}
