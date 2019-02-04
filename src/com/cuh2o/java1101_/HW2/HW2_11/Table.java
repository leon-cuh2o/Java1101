package com.cuh2o.java1101_.HW2.HW2_11;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, для которого хотите увидеться таблицу умножения от 1 до 10 –> \n");
        int num = in.nextInt();
        int x = 11;
        for (int i = 1; i < x; i++) {
            int z = num * i;
            System.out.println((int)z);
        }
    }
}


/*
i - счетчик
num - число, введенное с клавиатуры

 */