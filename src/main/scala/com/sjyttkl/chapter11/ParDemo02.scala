package com.sjyttkl.chapter11

/**
 * Create with: com.sjyttkl.chapter11
 * author: sjyttkl
 * E-mail: 695492835@qq.com
 * date: 2019/11/24 22:36
 * version: 1.0
 * description:  par 并行执行
 */
object ParDemo02 {
  def main(args: Array[String]): Unit = {

    val result1 = (0 to 100).map { case _ => Thread.currentThread.getName }.distinct
    //    val result2 = (0 to 100).par.map{case _ => Thread.currentThread.getName}.distinct
    println(result1) //非并行
    println("--------------------------------------------")
    //    println(result2) //并行
  }
}
