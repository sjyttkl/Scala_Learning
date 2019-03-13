package com.sjyttkl.chapter07.scalapackage

object TestTiger {
  def main(args: Array[String]): Unit = {
    //使用xh的Tiger
    val tiger1 = new com.sjyttkl.chapter07.scalapackage.xh.Tiger
    //使用xm的Tiger
    val tiger2 = new com.sjyttkl.chapter07.scalapackage.xm.Tiger
    println(tiger1 + " " + tiger2)

  }
}

class Employee {

}
