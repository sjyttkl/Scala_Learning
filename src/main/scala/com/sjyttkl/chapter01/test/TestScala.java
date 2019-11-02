package com.sjyttkl.chapter01.test;

//import scala.Predef;

/**
 * Create with: com.sjyttkl.chapter01.test
 * author: songdongdong
 * E-mail: songdongdong@jd.com
 * date: 2019/2/17 22:25
 * version: 1.0
 * description:
 */
//我们可以理解scala 在运行时，做了一个包装.
public class TestScala {
    public static void main(String[] paramArrayOfString)
    {
        TestScala$.MODULE$.main(paramArrayOfString);
    }
}

 final class TestScala$
{
    public static final TestScala$ MODULE$;

    static
    {
//        new ();
        MODULE$ = new TestScala$();
    }

    public void main(String[] args)
    {
//        Predef..MODULE$.println("hello , sclaa ,idea..");
        System.out.println("hello , sclaa ,idea..");
    }
    //private TestScala$() { MODULE$ = this; }

}
