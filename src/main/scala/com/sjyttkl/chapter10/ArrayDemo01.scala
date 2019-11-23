package com.sjyttkl.chapter10

/**
  * Create with: com.sjyttkl.chapter10 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/21 14:07 
  * version: 1.0
  * description:    数组，定长数组。（声明泛型）  第一种声明方式
  */
object ArrayDemo01 {
  def main(args: Array[String]): Unit = {
    //说明
    //1. 创建了一个Array对象,
    //2. [Int] 表示泛型，即该数组中，只能存放Int
    //3. [Any] 表示 该数组可以存放任意类型
    //4. 在没有赋值情况下，各个元素的值 0
    //5.  arr01(3) = 10 表示修改 第4个元素的值
    val arr01 = new Array[Int](4)  //底层 int[] arr01 = new int[4]
    println(arr01.length)

    println("arr01(0)=" + arr01(0)) // 集合才采用小括号访问。
    //数据的遍历

    for(i<-arr01){
      println(i)
    }
    println("----------------")
    arr01(3) = 10 //
    for (i <- arr01) {
      println(i)
    }
  }
}
