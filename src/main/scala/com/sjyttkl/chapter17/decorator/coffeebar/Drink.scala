package com.sjyttkl.chapter17.decorator.coffeebar

/**
 * 1) 装饰者模式:动态的将新功能附加到对象上。在对象功能扩展方面，它比继承更有弹性(递归)，
 * 装饰者模式也体现了开闭原则(ocp)
 * 2) 这里提到的动态的将新功能附加到对象和 ocp 原则，在后面的应用实例上会以代码的形式体现，
 * 请同学们注意体会。
 */
//说明
//1. Drink 是表示饮品，是一个抽象类
abstract class Drink {
  var description = ""
  private var price = 0.0f

  def setDescription(description: String): Unit = {
    this.description = description
  }

  def getDescription(): String = {
    description + " 价格: " + this.getPrice()
  }

  def getPrice(): Float = {
    price
  }

  def setPrice(price: Float): Unit = {
    this.price = price
  }
  //将计算成本的方法做成一个抽象方法cost
  def cost(): Float
}
