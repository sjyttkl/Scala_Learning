package com.sjyttkl.chapter08.mixin

/**
  * Create with: com.sjyttkl.chapter08.mixin 
  * author: sjyttkl
  * E-mail: 6965492835@qq.com
  * date: 2019/11/10 14:59 
  * version: 1.0
  * description:  
  */
object MinxInPro {
  def main(args: Array[String]): Unit = {
    val mySQL = new MySQL6 with DB6 {
      override var sal: Int = 10
    }

    print(mySQL.opertype)
  }
}

trait DB6  {
  var sal:Int //抽象字段  //特质中未被初始化的字段，必须被重写
  var opertype : String = "insert"// 特质中被初始化的字段，会直接被加入(不是继承）到 继承类中
  def insert(): Unit = {
  }
}
class MySQL6 {}
