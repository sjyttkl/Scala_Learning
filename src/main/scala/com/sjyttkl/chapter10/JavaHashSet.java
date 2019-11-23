package com.sjyttkl.chapter10;

import java.util.HashSet;

/**
 * Create with: com.sjyttkl.chapter10
 * author: sjyttkl
 * E-mail: 695492835@qq.com
 * date: 2019/11/23 15:53
 * version: 1.0
 * description:
 */
public class JavaHashSet {
    public static void main(String[] args) {
        //java中的Set的元素 没有顺序，不能重复
        HashSet hs = new HashSet<String>();
        hs.add("jack");
        hs.add("tom");
        hs.add("jack");
        hs.add("jack2");
        System.out.println(hs);

    }
}
