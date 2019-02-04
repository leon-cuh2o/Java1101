package com.cuh2o.java1101_.HW2.HW2_7;
import java.util.Scanner;

public class CompareDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение числа X –> ");
        double x = in.nextDouble();
        System.out.println("Введите значение числа Y –> ");
        double y = in.nextDouble();
        if ((int)x > (int)y) {
            System.out.println("Значение X больше значения Y");
                if ((int)x < 16) {
                    System.out.println("Но по меркам Ивлеевой число так себе…");
                }
                else
                {
                    System.out.println("Где-то в мире радуется одна Ивлеева");
                }
        }
        else
        {
            System.out.println("Значение Y больше значения X");
            if ((int)y < 16) {
                System.out.println("Но по меркам Ивлеевой число так себе…");
            }
            else
            {
                System.out.println("Где-то в мире радуется одна Ивлеева");
            }
        }
        }
    }
