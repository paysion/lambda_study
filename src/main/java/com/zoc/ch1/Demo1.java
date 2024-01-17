package com.zoc.ch1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程运行");
            }
        }).start();

        new Thread(()-> {
            System.out.println("新线程2运行");
        }).start();

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("ada");
        nameList.add("jack");
        nameList.add("tom");
        nameList.add("zook");
/*        Collections.sort(nameList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });*/

        Collections.sort(nameList,(o1, o2) -> o2.compareTo(o1));
        System.out.println(nameList);

    }
}
