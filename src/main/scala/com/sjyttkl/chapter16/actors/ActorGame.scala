package com.sjyttkl.chapter16.actors

import akka.actor.{ActorRef, ActorSystem, Props}

/**
  * Create with: com.sjyttkl.chapter16.actors 
  * author: sjyttkl
  * E-mail: 695492835@qq.com
  * date: 2020/3/24 23:31 
  * version: 1.0
  * description:  
  */
object ActorGame extends  App{

  //创建 ActorSystem
  val actorfactor = ActorSystem("actorFactroy")
  //创建BActor引用/代理
  var bActorRef: ActorRef = actorfactor.actorOf(Props[BActor], "bActor")

  //创建AActor的引用
   var aActor: ActorRef = actorfactor.actorOf(Props(new AActor(bActorRef)), "aActor")

  //actor出招
  aActor ! "出招"



}
