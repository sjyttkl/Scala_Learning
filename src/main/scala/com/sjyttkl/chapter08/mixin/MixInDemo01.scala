package com.sjyttkl.chapter08.mixin

/**
  * Create with: com.sjyttkl.chapter08.mixin
  * author: sjyttkl
  * E-mail: 6965492835@qq.com
  * date: 2019/11/3 16:03
  * version: 1.0
  * description:
  */
object MixInDemo01 {
  def main(args: Array[String]): Unit = {
  val oracleDB = new OracleDB with Operate3
    oracleDB.insert(100)

    val MySQL = new MySQL3 with Operate3
    MySQL.insert(200)

    //如果一个抽象类有抽象方法，如何动态混入特质
    val mySql_ = new MySQL3_ with Operate3 {
      override def say(): Unit = {
        println("say")
      }
    }
    mySql_.insert(999)
    mySql_.say()

  }
}


trait Operate3{
  def insert(id:Int):Unit={
    println("插入数据= " +id)
  }
}
class OracleDB { //空
}
abstract class MySQL3 { //空
}

abstract class MySQL3_ { //空
  def say()
}
