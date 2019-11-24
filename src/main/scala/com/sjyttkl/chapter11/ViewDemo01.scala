package com.sjyttkl.chapter11

/**
  * Create with: com.sjyttkl.chapter11 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/24 22:27 
  * version: 1.0
  * description:  view方法会产生一个总是被懒执行的集合。   view不会缓存  数据，每次都要重新计算，比如遍历View的时候
  */
object ViewDemo01 {
  def main(args: Array[String]): Unit = {

    def multiple(num: Int): Int = {
      num
    }

    //如果这个数，逆序后和原来数相等，就返回true,否则返回false
    def eq(i: Int): Boolean = {
      println("eq 被调用..")
      i.toString.equals(i.toString.reverse)
    }

    //说明: 没有使用view,常规方式
    val viewSquares1 = (1 to 100).filter(eq)
    println(viewSquares1)


    //使用view，来完成这个问题,程序中，对集合进行map,filter,reduce,fold...
    //你并不希望立即执行，而是在使用到结果才执行，则可以使用view来进行优化.
    val viewSquares2 = (1 to 100).view.filter(eq)
    println(viewSquares2)
    //遍历
    for (item <- viewSquares2) {
      println("item=" + item)
    }



  }
}
