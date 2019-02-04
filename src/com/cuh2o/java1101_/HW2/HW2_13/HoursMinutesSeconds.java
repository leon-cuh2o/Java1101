package com.cuh2o.java1101_.HW2.HW2_13;
import java.util.Scanner;

public class HoursMinutesSeconds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("С помощью этой программы вы можете узнать сколько времени у вас осталось на то, чтобы ничего не сделать");
        System.out.print("Введите количество суток, которое вы планируете чиллить –> ");
        int time = in.nextInt();
        int seconds = (int)time * 60 * 24 * 60;
        int minutes = (int)time * 24 * 60;
        int hours = (int)time * 24;
        System.out.println("Секунд – " + (int)seconds);
        System.out.println("Минут – " + (int)minutes);
        System.out.println("Часов – " + (int)hours);
    }
}
