package com.sjyttkl.chapter09

/**
  * Create with: com.sjyttkl.chapter09 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/20 11:41 
  * version: 1.0
  * description:   如果要给一个类曾加一个方法，可以使用隐式转换来实现。动态增加功能。比如mysql增加一个delete  . OCP原则。
  */
object ImplicitDemo02 {
  def main(args: Array[String]): Unit = {

    //编写一个隐式函数，丰富mySQL功能
    implicit def addDelete(mysql:MySQL):DB={
      new DB
    }


  //创建mysql对象
    val mysql = new MySQL
    mysql.insert()
    mysql.delete()// 编译器工作 分析 addDelete$1(mySQL).delete()
    mysql.update()
  }

  class MySQL{
    def insert():Unit={
      println("insert")
    }
  }
  class DB{
    def delete():Unit={
      println("delete")
    }
    def update(): Unit = {
      println("update")
    }
  }
}
class Dog {

}