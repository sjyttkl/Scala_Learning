package com.sjyttkl.chapter09

/**
  * Create with: com.sjyttkl.chapter09 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/20 11:58 
  * version: 1.0
  * description: 隐式值
  */
object ImplicitValDemo03 {
  def main(args: Array[String]): Unit = {
    implicit val str1:String = "jack" //这个就是隐式值

    //implicit name: String ：name就是隐式参数
    def hello(implicit  name:String):Unit={
      println(name+" hello")
    }

    hello //底层 hello$1(str1);     隐式值不需要带()

  }
}
