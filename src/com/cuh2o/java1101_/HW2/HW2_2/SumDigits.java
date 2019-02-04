package com.cuh2o.java1101_.HW2.HW2_2;
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число Num –> ");
        int num = in.nextInt();
        int b = num % 10;
        int c = (num / 10) % 10;
        System.out.println("Сумма цифр числа Num (" + num + ") равна " + (b+c));
    }
}
