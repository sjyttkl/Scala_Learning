package com.sjyttkl.chapter18.upperbounds



//1)和 Animal 直系的，是 Animal 父类的还是父类处理，是 Animal 子类的按照 Animal 处理()，
// 2)和 Animal 无关的，一律按照 Object 处理!
object LowerBoundsDemo {
  def main(args: Array[String]): Unit = {
    biophony(Seq(new Bird, new Bird)) //? √
    biophony(Seq(new Animal, new Animal)) //对
    biophony(Seq(new Animal, new Bird)) //√
    //biophony(Seq(new Earth, new Earth)) //×,因为Earth不是Animal子类
  }
  //上界
  def biophony[T <: Animal](things: Seq[T]) = things map (_.sound)
}

class Earth { //Earth 类
  def sound() { //方法
    println("hello !")
  }
}

class Animal extends Earth {
  override def sound() = { //重写了Earth的方法sound()
    println("animal sound")
  }
}

class Bird extends Animal {
  override def sound() = { //将Animal的方法重写
    println("bird sounds")
  }
}
