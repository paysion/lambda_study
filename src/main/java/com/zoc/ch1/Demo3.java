package com.zoc.ch1;

public class Demo3 {
    public static void main(String[] args) {
        // 接口作为局部变量
        Flyable flyable1 = new Flyable(){
            @Override
            public void fly() {
                System.out.println("大雁飞行");
            }

        };

        flyable1.fly();

        Flyable flyable2 = () ->  System.out.println("大雁飞行");
        flyable2.fly();
    }
}
