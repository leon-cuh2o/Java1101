package com.cuh2o.java1101_.HW2.HW2_3;
import java.util.Scanner;

public class RoundDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите число Num –> ");
        double num = in.nextDouble();
        double newNum = (double)Math.round(num);
        System.out.println("Если округлить число Num (" + num + "), то получим число –> " + (int)num);
        System.out.println("Если округлить число Num (" + num + "), то получим число –> " + (double)newNum);
    }
}
