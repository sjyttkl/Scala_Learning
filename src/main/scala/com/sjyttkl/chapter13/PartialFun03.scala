package com.sjyttkl.chapter13

/**
  * Create with: com.sjyttkl.chapter13 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/22 21:58 
  * version: 1.0
  * description:  
  */
object PartialFun03 {
  def main(args: Array[String]): Unit = {


    //可以将前面的案例的偏函数，进行简写
    def partialFun: PartialFunction[Any, Int] = {
      //简写成case形式
      case i: Int => i + 1
      case j: Double => j.asInstanceOf[Int]
      case f: Float => (f * 2).toInt
    }

    val list = List(1, 2, 3, 4, 5, 6, "hello")
    val list2 = list.collect(partialFun)
    println("list2 ==  ", list2)


    //第二种简写的方式
    val list3 = list.collect { case i: Int => i + 1
    case j: Double => j.asInstanceOf[Int]
    case f: Float => (f * 2).toInt
    }
    println(list3)


  }

}
