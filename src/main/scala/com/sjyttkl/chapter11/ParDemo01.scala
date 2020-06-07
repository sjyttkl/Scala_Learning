package com.sjyttkl.chapter11

/**
 * Create with: com.sjyttkl.chapter11
 * author: sjyttkl
 * E-mail: 695492835@qq.com
 * date: 2019/11/24 22:36
 * version: 1.0
 * description:  par 并行执行
 */
object ParDemo01 {
  def main(args: Array[String]): Unit = {

    (1 to 5).foreach(println(_)) //也可以不写 _
    println()
    //这里输出的结果是无序的，说明是将println任务分配给不同cpu
    //    (1 to 5).par.foreach(println(_))


  }
}
