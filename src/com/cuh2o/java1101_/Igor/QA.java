package com.cuh2o.java1101_.Igor;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QA {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Компьютер: Введите свое имя в этом поле –> ");
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String Name = reader.readLine();
        if (Name.equals("Игорь") || Name.equals("Настя")) {
            System.out.println("Пошел нахуй, " + (String)Name + "\n");
        }
        else
        {
            System.out.println("Приятно познакомиться, " + (String)Name + "\n");
        }
        if (Name.equals("Сиона")) {
            System.out.println("Да здравствуй ККК!");
        }

    }

}
