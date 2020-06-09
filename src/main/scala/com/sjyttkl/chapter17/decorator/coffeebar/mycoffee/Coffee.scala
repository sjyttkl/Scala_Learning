package com.sjyttkl.chapter17.decorator.coffeebar.mycoffee

import com.sjyttkl.chapter17.decorator.coffeebar.Drink


//在Drink 和  单品咖啡，我做了一个缓冲层
//这里是为了扩展，针对当前项目可以不要。做缓冲层的，目的是为了后面可能有奶茶等饮品出现 。方便扩展
class Coffee extends Drink{
  override def cost(): Float = {
    super.getPrice()
  }
}
