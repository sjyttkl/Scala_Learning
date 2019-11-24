package com.sjyttkl.chapter11

import scala.collection.mutable

/**
  * Create with: com.sjyttkl.chapter11 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2019/11/24 0:27 
  * version: 1.0
  * description:  
  */
object Exercise03 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    val map2 = sentence.foldLeft(Map[Char,Int]())(charCount)
    println("map2=" + map2)

    //使用可变的map,效率更高.
    //1. 先创建一个可变map,作为左折叠的第一个参数
    val map3 = mutable.Map[Char,Int]()
    sentence.foldLeft(map3)(charCount2)
    println("map3=" + map3)

  }

  //使用不可变map实现
  def charCount(map:Map[Char,Int],char:Char): Map[Char,Int] = {
    println(map)
    map + (char -> (map.getOrElse(char,0) + 1) )//这里每次返回个新的
  }

  //使用可变map实现
  def charCount2(map:mutable.Map[Char,Int], char:Char): mutable.Map[Char,Int] = {
    println(map)
    map += (char -> (map.getOrElse(char,0) + 1) ) //这里还是原来的 map
  }
}
