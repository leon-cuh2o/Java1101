package com.cuh2o.java1101_.HW2.HW2_4;
import java.util.Scanner;

public class SumDigits3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите любое трехзначное число –> ");
        int num = in.nextInt();
        int a = num % 10;
        int b = (num / 10) % 10;
        int c = (num / 100) % 10;
        System.out.println("Сумма трехзначного числа Num(" + num + ")= " + (a + b + c));
    }
}
