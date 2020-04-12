package com.sjyttkl.chapter14

/**
  * Create with: com.sjyttkl.chapter14 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/23 9:50 
  * version: 1.0
  * description: 递归的注意事项
  * 注意：数值分析，分析代码运行效率，注意去学习
  */
object RecursiveFnb {
  def main(args: Array[String]): Unit = {
    var count = BigInt(10)
    println(fbn(3))
    println("递归次数： ", count)


    //递归的次数会出现指数的增长
    def fbn(n: BigInt): BigInt = {
      count += 1
      if (n == 1 | n == 2) 1
      else {
        fbn(n - 1) + fbn(n - 2)
      }
    }


  }


}
