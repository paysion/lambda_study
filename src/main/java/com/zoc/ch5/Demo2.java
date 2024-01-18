package com.zoc.ch5;

import java.util.*;
import java.util.stream.Stream;

public class Demo2 {

    public static void main(String[] args) {
        // 方式1-根据Collection获取流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        stream1.count();
        // stream1.count(); stream流只能用一次

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();
        Stream<String> stream3 = map.keySet().stream();
        Stream<String> stream4 = map.values().stream();
        Stream<Map.Entry<String, String>> stream5 = map.entrySet().stream();

        // 方式2-Stream.of:适合普通的数字
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5, 6);
        String[] strList = {"1","2","3"};
        Stream<String> stream7 = Stream.of(strList);
    }
}
