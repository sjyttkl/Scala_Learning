package com.sjyttkl.chapter16.actors

import akka.actor.{Actor, ActorRef}

/**
  * Create with: com.sjyttkl.chapter16.actors 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/24 23:30 
  * version: 1.0
  * description:  
  */
class AActor(actorRef: ActorRef) extends Actor {

  val bActorRef: ActorRef = actorRef

  override def receive: Receive = {
    case "start" => {
      println("AActor 出招了，start ok ")
      self ! "我打"//发给自己
    }
    case "我打" => {
      //给BActor 发出消息
      //这里需要持有BActor的引用 （BActorBef）
      println("AActor（黄飞鸿） 厉害，看我佛山无影脚")
      Thread.sleep(1000)
      bActorRef ! "我打" //给BACtor 发出消息

    }
  }

}
