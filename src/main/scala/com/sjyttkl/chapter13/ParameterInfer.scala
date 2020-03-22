package com.sjyttkl.chapter13

/**
  * Create with: com.sjyttkl.chapter13 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/22 23:21 
  * version: 1.0
  * description:  参数（类型）推断
  *1. 参数类型是可以推断的，可以省略参数类型
  * 2. 当传入的函数，只有单个参数时，可以省去括号
  * 3. 如果比那里只在 => 右边出现一次，可以用 _来代替
  *
  */
object ParameterInfer {
  val list = List(1, 2, 3, 4)
  println(list.map((x: Int) => x + 1)) //(2,3,4,5)
  println(list.map((x) => x + 1)) //(2,3,4,5)
  println(list.map(x => x + 1)) //(2,3,4,5)
  println(list.map(_ + 1)) //(2,3,4,5)


  println(list.reduce(f1)) // 10
  println(list.reduce((n1: Int, n2: Int) => n1 + n2)) //10
  println(list.reduce((n1, n2) => n1 + n2)) //10
  println(list.reduce(_ + _)) //10, 因为 n1 和n2 在 =>右边 只出现一次，所以直接用_代替的。


  val res = list.reduce(_ + _)

  def f1(n1: Int, n2: Int): Int = {
    n1 + n2
  }


}
