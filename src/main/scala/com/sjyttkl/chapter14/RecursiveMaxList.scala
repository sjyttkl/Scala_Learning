package com.sjyttkl.chapter14

/**
  * Create with: com.sjyttkl.chapter14 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/23 9:38 
  * version: 1.0
  * description:  
  */
object RecursiveMaxList {
  def main(args: Array[String]): Unit = {

    println(myMax(List(10,2,4,9,0)))
    var list = List(1,2,4,0,8,9,-1)
    println(list.head)
    println(list.tail)
  }

  //使用递归求最大值
  def myMax(xs: List[Int]): Int = {
    if (xs.isEmpty) {
      throw new java.util.NoSuchElementException
    }
    if (xs.size == 1) {
      xs.head
    }
    else if (xs.head > myMax(xs.tail)) {
      xs.head
    }
    else {
      myMax(xs.tail)
    }
  }
}
