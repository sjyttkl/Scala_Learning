package com.sjyttkl.stream;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Create with: PACKAGE_NAME
 * author: songdongdong
 * E-mail: songdongdong@weidian.com
 * date: 2022/4/20 13:29
 * version: 1.0
 * description: stream 的高级用法
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> dataMap = Maps.newHashMap();
        dataMap.put("1", 5);
        dataMap.put("2", 6);
        dataMap.put("3", 10);

        List<String> list = Lists.newArrayList();
        if (MapUtils.isNotEmpty(dataMap)) {
            list = dataMap.entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .limit(10)
                    .map(Map.Entry::getKey)
                    .filter(StringUtils::isNotBlank)
                    .collect(Collectors.toList());
        }
        System.out.println(list);


        List<Map<String, Object>> result = Lists.newLinkedList();
        list.stream().map(tag -> {
            HashMap<String, Object> res = new HashMap<>();
            res.put("text", tag);
            res.put("type", 3); //用户偏好是3
            return res;
        }).forEach(result::add);
        System.out.println(result);
    }
}
