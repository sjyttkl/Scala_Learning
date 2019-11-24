package com.sjyttkl.chapter11

/**
  * Create with: com.sjyttkl.chapter11 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/24 22:11 
  * version: 1.0
  * description:   拉链，本质就是两个集合的 合并成元组。如果两个集合长度不一致，则会造成数据的丢失
  */
object ZipDemo01 {
  def main(args: Array[String]): Unit = {
    // 拉链
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)
    val list3 = list1.zip(list2) // (1,4),(2,5),(3,6)
    println("list3=" + list3)

    for (item <- list3){
      println(item._1+"  "+item._2)// 按照以元组的方式取出
    }


  }
}
