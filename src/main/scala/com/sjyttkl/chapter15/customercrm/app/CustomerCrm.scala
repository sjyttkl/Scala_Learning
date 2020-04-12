package com.sjyttkl.chapter15.customercrm.app

import com.sjyttkl.chapter15.customercrm.view.CustomerView

/**
  * Create with: com.sjyttkl.chapter15.customercrm.app 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/24 0:06 
  * version: 1.0
  * description:  
  */
object CustomerCrm {
  def main(args: Array[String]): Unit = {
    new CustomerView().mainMenu()
  }
}
