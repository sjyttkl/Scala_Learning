package com.sjyttkl.chapter08.mytrait


/**
* Create with: com.sjyttkl.chapter08.mytrait
* author: sjyttkl
* E-mail: 6965492835@qq.com
* date: 2019/11/2 21:37
* version: 1.0
* description:
*/
object TraitDemo01 {
  def main(args: Array[String]): Unit = {
    println("尝试下")
  }
}

//trait Serializable extends Any with java.io.Serializable
//在scala中，所有的java的接口都可以当做trait来使用(如上面的语法)
object  T1 extends Serializable{

}

object  T2 extends Cloneable {

}

