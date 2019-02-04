package com.cuh2o.java1101_.HW2.HW2_9;
import java.util.Scanner;

public class IntOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки –> ");
        double num = in.nextDouble();
        if ((double)num % 2 == 0) {
            System.out.println("Введенное вами число, целое");
        }
        else
        {
            System.out.println("Введенное вами число не является целым");
        }
    }
}
