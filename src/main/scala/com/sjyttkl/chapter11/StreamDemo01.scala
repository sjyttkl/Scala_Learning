package com.sjyttkl.chapter11

/**
  * Create with: com.sjyttkl.chapter11 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/24 22:17 
  * version: 1.0
  * description:  流,是一个集合，可以存放无穷多个数据。但是不会一次性产生出来，末尾遵守lazy规则
  */
object StreamDemo01 {
  def main(args: Array[String]): Unit = {
    //创建Stream
    def numsForm(n: BigInt) : Stream[BigInt] = n #:: numsForm(n + 1) //numsForm(n + 1)
    val stream1 = numsForm(1)
    println(stream1) // (1,?)
    //取出第一个元素
    println("head=" + stream1.head) // 1
    println(stream1.tail) // 2，生成新的数据
    println(stream1) //? (1,2,...)

    //看一个应用案例
    def multi(x:BigInt) : BigInt = {
      x * x
    }
    println(numsForm(5).map(multi)) //(25, ?)

  }
}
