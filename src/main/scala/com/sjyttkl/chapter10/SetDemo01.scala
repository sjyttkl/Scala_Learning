package com.sjyttkl.chapter10

import scala.collection.mutable

/**
  * Create with: com.sjyttkl.chapter10 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/23 16:11 
  * version: 1.0
  * description:  
  */
object SetDemo01 {
  def main(args: Array[String]): Unit = {
    val set = Set(1, 2, 3) //不可变
    println(set)

    val set2 = mutable.Set(1,2,"hello") //可以变
    println("set2" + set2)

    println(set.max)
    println(set.min)

    //添加三种写法
    set2.add(6)
    set2 +=7
    set2 +=(8)


    //删除 ，两种写法
    set2 -= 2//删除
    set2.remove("abc") //直接删除
    println(set2)//说明：如果删除的对象不存在，则不生效，也不会报错

    //遍历
    for(x<-set2){
      print(x +" ")
    }


  }
}
