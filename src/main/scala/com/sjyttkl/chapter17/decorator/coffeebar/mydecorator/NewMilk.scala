package com.sjyttkl.chapter17.decorator.coffeebar.mydecorator

import com.sjyttkl.chapter17.decorator.coffeebar.Drink



class NewMilk(obj: Drink) extends Decorator(obj) {

  setDescription("新式Milk")
  setPrice(4.0f)
}