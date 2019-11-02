package com.sjyttkl.chapter08.mytrait

/**
  * Create with: com.sjyttkl.chapter08.mytrait 
  * author: sjyttkl
  * E-mail: 6965492835@qq.com
  * date: 2019/11/3 1:13 
  * version: 1.0
  * description:  
  */
object TraitDemo03 {
  def main(args: Array[String]): Unit = {
  println("~~~~")
    val sheep = new Sheep
    sheep.sayHi()
    sheep.sayHello()
  }
}

//当一个trait有抽象方法和非抽象方法时
//1. 一个trait在底层对应两个 Trait03.class 接口
//2. 还对应 Trait03$class.class Trait03$class抽象类
//4. 现在编译器有变  ，其实就一个类而已了。
trait  Trait03{  // 编译器直接就生成一个：public abstract interface Trait03
  def sayHi()
  def sayHello():Unit={
    println("say Hello ~~")
  }
}
//当trait有接口和抽象类是
//1.class Sheep extends Trait03 在底层 对应
//2.class Sheep implements  Trait03
//3.当在 Sheep 类中要使用 Trait03的实现的方法，就通过  Trait03$class

class Sheep extends Trait03{
  override def sayHi(): Unit = {
    println("小羊 say hi ")
  }
}