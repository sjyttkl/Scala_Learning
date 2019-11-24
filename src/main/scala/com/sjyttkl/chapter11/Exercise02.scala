package com.sjyttkl.chapter11

import scala.collection.mutable.ArrayBuffer

/**
  * Create with: com.sjyttkl.chapter11 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/24 0:28 
  * version: 1.0
  * description:  
  */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    val arrayBuffer = new ArrayBuffer[Char]()
    //理解折叠的第一个传入的arrayBuffer 含义.
    sentence.foldLeft(arrayBuffer)(putArray)
    println("arrayBuffer=" + arrayBuffer)

  }
  def putArray(arr:ArrayBuffer[Char],c:Char): ArrayBuffer[Char] = {
    //将c 放入到arr 中
    arr.append(c)
    arr
  }
}
