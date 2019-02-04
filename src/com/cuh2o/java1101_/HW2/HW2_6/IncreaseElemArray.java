package com.cuh2o.java1101_.HW2.HW2_6;

public class IncreaseElemArray {
    public static void main(String[] args) {
        System.out.println(increase(new int[] {10, 20, 30, 40, 50}));
    }
    static int increase(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i+ " –> ");
            System.out.println(array[i]);
        }
        System.out.println("\nПри увеличении массива на 10%, получим следующие числа: \n");
        for (int k = 0; k <array.length; k++) {
            array[k] = (int)(array[k] + array[k] * 0.10);
            System.out.print(k+" -> ");
            System.out.println(array[k]);}
        return 0 ;
    }

    /*Программа увеличивает каждый элемент массива*/

}