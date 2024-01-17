package com.zoc.ch3;

@FunctionalInterface
interface Operator{
    int getMax(int[] arr);
}

public class Demo1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int myMax = getArrayMax(arr, arrParam -> {
            System.out.println("执行步骤2");
            int max = arrParam[0];
            for (int i = 1; i < arrParam.length; i++) {
                if (arrParam[i] > max) {
                    max = arrParam[i];
                }
            }
            return max;
        });
        System.out.println(myMax);
    }

    private static int getArrayMax(int[] arr,Operator op) {
        System.out.println("执行步骤1");
        return op.getMax(arr);
    }
}
