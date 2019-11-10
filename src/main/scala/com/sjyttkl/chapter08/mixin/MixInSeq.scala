package com.sjyttkl.chapter08.mixin

/**
  * Create with: com.sjyttkl.chapter08.mixin 
  * author: sjyttkl
  * E-mail: 6965492835@qq.com
  * date: 2019/11/10 15:21 
  * version: 1.0
  * description:  声明对象的时候，动态混入
  */
object MixInSeq {
  def main(args: Array[String]): Unit = {

    //这时FF是这样 形式 class FF extends EE with CC with DD
    /*
    调用当前类的超类构造器
第一个特质的父特质构造器
第一个特质构造器
第二个特质构造器的父特质构造器, 如果已经执行过，就不再执行
第二个特质构造器
.......重复4,5的步骤(如果有第3个，第4个特质)
当前类构造器   [案例演示]

     */
    //1. E...
    //2. A...
    //3. B....
    //4. C....
    //5. D....
    //6. F....
    val ff1 = new FF() //这种方式，在构建类对象、在混入特质时、该对象还没有创建

    println(ff1)

    //这时我们是动态混入
    /*
    先创建 new KK 对象，然后再混入其它特质

    调用当前类的超类构造器
当前类构造器
第一个特质构造器的父特质构造器
第一个特质构造器.
第二个特质构造器的父特质构造器, 如果已经执行过，就不再执行
第二个特质构造器
.......重复5,6的步骤(如果有第3个，第4个特质)
当前类构造器   [案例演示]

     */
    //1. E...
    //2. K....
    //3. A...
    //4. B
    //5. C
    //6. D
    println("=======================")
    val ff2 = new KK with CC with DD //这种方式是在构造匿名子类、可以理解为混入特质的时候、对象已经创建好了。
    println(ff2)

  }
}

trait AA {
  println("A...")
}

trait BB extends AA {
  println("B....")
}

trait CC extends BB {
  println("C....")
}

trait DD extends BB {
  println("D....")
}

class EE { //普通类
  println("E...")
}

class FF extends EE with CC with DD { //先继承了EE类，然后再继承CC 和DD // 这种范式
  println("F....")
}

class KK extends EE { //KK直接继承了普通类EE
  println("K....")
}

