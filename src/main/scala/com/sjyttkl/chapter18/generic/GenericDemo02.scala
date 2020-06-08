package com.sjyttkl.chapter18.generic

// https://www.e-learn.cn/topic/3582102
object GenericDemo02 {
  def main(args: Array[String]): Unit = {

    //使用
    val class01 = new EnglishClass[SeasonEnum.SeasonEnum, String, String](SeasonEnum.spring, "0705班", "高级班")
    println("class01 " + class01.classSesaon + " " + class01.className + class01.classType)

    val class02 = new EnglishClass[SeasonEnum.SeasonEnum, String, Int](SeasonEnum.spring, "0707班", 1)

    println("class02 " + class02.classSesaon + " " + class02.className + " " + class02.classType)
  }
}


/*
Scala泛型应用案例2

要求
请设计一个EnglishClass (英语班级类)，在创建EnglishClass的一个实例时，需要指定[ 班级开班季节(spring,autumn,summer,winter)、班级名称、班级类型]
开班季节只能是指定的，班级名称为String, 班级类型是(字符串类型 "高级班", "初级班"..) 或者是 Int 类型(1, 2, 3 等)
请使用泛型来完成本案例.

 */
class EnglishClass[A, B, C](val classSesaon: A, val className: B, val classType: C)

//季节是枚举类型,/定义枚举类型，注意是  object
object SeasonEnum extends Enumeration {
  type SeasonEnum = Value //声明枚举对外暴露的变量类型，这行是可选的，类型别名，在使用import语句的时候比较方便，建议加上
  val spring, autumn, summer, winter = Value ////枚举的定义
}