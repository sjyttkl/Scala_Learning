package com.sjyttkl.chapter09

/**
  * Create with: com.sjyttkl.chapter09 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/20 18:12 
  * version: 1.0
  * description:   隐式类
  */
//隐式类构造函数只能有一个，
//隐式类必须被定义在“类” 或者“伴随对象”或者“包对象" 里，即隐式类不能是 顶级的（top-level-objects)
//隐式类 不能是case class
//作用域不能有与之前相同名称的标识符
object ImplicitClassDemo {
  def main(args: Array[String]): Unit = {
    //DB1会对应生成隐式类
    //DB1是一个隐式类, 当我们在该隐式类的作用域范围，创建MySQL1实例
    //该隐式类就会生效, 这个工作仍然编译器完成
    //看底层..
    implicit  class DB1(val m:MySQL1){
      def addSuffix():String = {
        m+" scala DB1"
      }
    }
    //创建一个MySQL1实例
    val mysql = new MySQL1
    mysql.sayOK
    mysql.addSuffix() //研究 如何关联到 DB1$1(mySQL).addSuffix();

    implicit  def f1(d:Double):Int={
      d.toInt
    }

    def test1(n1:Int)={
      println("ok")
    }

    test1(10.1)  //方法参数或者是赋值的时候，也会用到隐式转换
  }
}
class MySQL1{
  def sayOK():Unit={
    println("sayok ")
  }
}