package com.cuh2o.java1101_.HW2.HW2_15;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину катета X –> ");
        int x = in.nextInt();
        System.out.println("Введите длину катета Y –> ");
        int y = in.nextInt();
        double space = (int)x * (int)y;
        double z = Math.pow(x, 2.0) + Math.pow(y, 2.0); //гипотенуза
        System.out.println("Длина гипотенузы равняется –> " + (double)z);
        System.out.println("Площадь треугольника равняется –> " + (double)space);
        /*double per = (int)x + (int)y + (double) sqrt((double) z);
        System.out.println("Периметр треугольника равняется –> " + (double)per);*/
    }
}
