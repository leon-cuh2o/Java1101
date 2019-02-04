package com.cuh2o.java1101_.HW2.QA;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class qa {
    public static void main(String[] args) throws Exception {
        System.out.println("Давай знакомиться. Как тебя зовут? –> ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Name = reader.readLine();
        System.out.println("Приятно познакомиться, " +(String)Name + "\n");
        if (Name.equals("Игорь") || Name.equals("Настя")) {
            System.out.println("Иди нахуй, " +(String)Name + "\n");
        }
        else
            if (Name.equals("Сиона")) {
                System.out.println("Да здравствует ККК!");
            }
    }
}
