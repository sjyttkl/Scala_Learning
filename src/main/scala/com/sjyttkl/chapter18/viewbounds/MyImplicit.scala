package com.sjyttkl.chapter18.viewbounds

import com.sjyttkl.chapter18.viewbounds.Person3

object MyImplicit {
  //返回一个new Ordered，匿名
  implicit def person3toOrderedPerson3(p3:Person3) = new Ordered[Person3] {
    override def compare(that: Person3) = { //是你自己的业务逻辑
      p3.age - that.age
    }
  }

}
