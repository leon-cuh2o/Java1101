package com.cuh2o.java1101_.HW2.HW2_14;
import java.util.Scanner;

public class UAH_USD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество гривен, которое вы хотите поменять –> ");
        double uah = in.nextDouble();
        double usd = (int)uah * 0.036;
        System.out.println("Вы можете получить целых " + (double)usd + " долларов США!");
    }
}
