package com.sjyttkl.chapter15.customercrm.service

import com.sjyttkl.chapter15.customercrm.bean.Customer

import scala.collection.mutable.ArrayBuffer
import util.control.Breaks._
/**
  * Create with: com.sjyttkl.chapter15.customercrm.service 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/24 0:02 
  * version: 1.0
  * description:  
  */
class CustomerService {
  var customerNum = 1
  val customers = ArrayBuffer(new Customer(1, "tom", '男', 10, "100", "sjyttkl@qq.com"))

  def list(): ArrayBuffer[Customer] = {
    this.customers
  }

  def add(customer: Customer): Boolean = {
    //添加id
    customerNum += 1
    customer.id = customerNum
    this.customers.append(customer)
    true

  }

  def del(id: Int): Boolean = {
    var index = findIndexById(id)
    if (index != -1) {
      customers.remove(index)
      true
    } else {
      false
    }

  }

  //根据id找到index
  //根据id找到index
  def findIndexById(id: Int) = {
    var index = -1 //默认-1,如果找到就改成对应,如果没有找到，就返回-1
    //遍历customers
    breakable {
      for (i <- 0 until customers.length) {
        if (customers(i).id == id) { //找到
          index = i
          break()
        }
      }
    }
    index
  }

}
