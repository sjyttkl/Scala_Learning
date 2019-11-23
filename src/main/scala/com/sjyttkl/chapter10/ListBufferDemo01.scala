package com.sjyttkl.chapter10

import scala.collection.mutable.ListBuffer

/**
  * Create with: com.sjyttkl.chapter10 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/23 15:26 
  * version: 1.0
  * description:  
  */
object ListBufferDemo01 {
  def main(args: Array[String]): Unit = {
    //创建ListBuffer
    val lst0 = ListBuffer[Int](1, 2, 3)
    //如何访问
    println("lst0(2)=" + lst0(2)) // 输出 lst0(2)= 3
    for (item <- lst0) { // 遍历，是有序
      println("item=" + item)
    }

    //动态的增加元素，lst1就会变化, 增加一个一个的元素
    val lst1 = new ListBuffer[Int] //空的ListBuffer
    lst1 += 4 // lst1 (4)
    lst1.append(5) // append 可以传入 可变参数，list1(4,5)，

    //集合与集合之间的相加
    lst0 ++= lst1 // lst0 (1, 2, 3,4,5)

    println("lst0=" + lst0)


    val lst2 = lst0 ++ lst1 //集合追加， lst2(1, 2, 3,4,5,4,5)
    println("lst2=" + lst2)

    val lst3 = lst0 :+ 5 // lst0 不变 lst3(1, 2, 3,4,5,5)
    println("lst3=" + lst3)


    println("=====删除=======")
    println("lst1=" + lst1)
    lst1.remove(1) // 表示将下标为1的元素删除
    for (item <- lst1) {
      println("item=" + item) //4
    }

  }
}
