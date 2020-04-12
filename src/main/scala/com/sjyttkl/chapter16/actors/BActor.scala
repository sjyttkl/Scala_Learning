package com.sjyttkl.chapter16.actors

import akka.actor.Actor

/**
  * Create with: com.sjyttkl.chapter16.actors 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/24 23:31 
  * version: 1.0
  * description:  
  */
class BActor extends Actor {
  override def receive: Receive = {
    case "我打" =>{
      println("BACtor(乔峰) 挺猛，看我降龙十八掌")
      Thread.sleep(1000)
      //通过sender() 可以获取到发送消息过来的 actor 的 ref
      sender !"我打"
    }
  }
}
