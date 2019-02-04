package com.cuh2o.java1101_.HW2.HW2_5;
import java.util.Scanner;

public class MoonWeight {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Здравствуйте! С помощью этой программы, вы можете узнать сколько бы вы весили на Луне");
        System.out.println("Введи свой вес, Начинающий ППшник –> ");
        double num = in.nextDouble();
        double Moon = 17;
        double weight = num % Moon;
        System.out.println("На Луне вы бы весили всего " + (double)weight);
        System.out.println("Может, столько вам и нужно сбросить к лету?");
    }
}
