package com.cuh2o.java1101_.HW2.HW2_16;
import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение температуры в градусах по Цельсию –> ");
        double celcius = in.nextDouble();
        double fahr = (double)celcius * 9 / 5 + 32;
        System.out.println("Если перевести в Фаренгейты, получится –> " + (double)fahr);
    }
}
