package com.cuh2o.java1101_.HW4;
import java.util.Scanner;

public class FIO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше ФИО –> ");
        String Lastname = in.nextLine();
        String Name = in.nextLine();
        String IO = in.nextLine();
        String Fullname = (Name + " " + IO + " " + Lastname);
        String reverseMe = Fullname;
            for (int i = 0; i < reverseMe.length(); i++) {
            reverseMe = reverseMe.substring(1, reverseMe.length() - i)
                + reverseMe.substring(0, 1)
                + reverseMe.substring(reverseMe.length() - i, reverseMe.length());
            }
        System.out.println("Приятно познакомиться, " + Fullname);
        System.out.println("А вот, как выглядит ваше ФИО, если отзеркалить его –> " + reverseMe);
        String wow = Fullname;
    }
}
