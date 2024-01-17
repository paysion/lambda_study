package com.zoc.ch5;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("张无忌");
        nameList.add("张三丰");
        nameList.add("金毛狮王");
        nameList.add("张大");
        nameList.add("黄蓉");
        //找出姓的新张的同学，并存到新的集合中
        //1-创建新的集合存放姓张的同学
        ArrayList<String> nameListZhang = new ArrayList<>();
        nameList.forEach(name -> {
            if (name.startsWith("张")) {
                nameListZhang.add(name);
            }
        });
        System.out.println(nameListZhang);

        //在姓张的同学中，找出名字是三个字的同学
        //2-创建新的集合，在姓张得同学中找出名字是3个字的
        ArrayList<String> nameListThreeZhang = new ArrayList<>();
        nameListZhang.forEach(name -> {
            if (name.length() == 3 ) {
                nameListThreeZhang.add(name);
            }
        });
        System.out.println(nameListThreeZhang);

        nameList.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(s -> nameListThreeZhang.add(s));
        System.out.println(nameListThreeZhang);

        System.out.println("---------------------------------");


    }
}
