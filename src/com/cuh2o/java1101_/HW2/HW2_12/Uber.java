package com.cuh2o.java1101_.HW2.HW2_12;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Uber {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Таксист: На какое расстояние едем, молодой? \n");
        double distance = in.nextDouble();
        System.out.println("Таксист: За сколько добраться нужно? \n");
        int time = in.nextInt();
        System.out.println("Таксист: За сколько, за сколько? За " +(int)time + "?\n");
        System.out.println("Таксист: Ну, это вам либо такси другое, либо тариф двойной\n");
        double Speed = (double)distance / (int)time;
        System.out.println("Компьютер: Соглашаемся? Y/N\n");
        BufferedReader reader = new BufferedReader(( new InputStreamReader(System.in)));
        String Answer = reader.readLine();
            if (Answer.equals("Y")) {
                System.out.println("Таксист: Тогда за " + (double)Speed + " доберемся!\n");
            }
            else
                if (Answer.equals("N")) {
                    System.out.println("Таксист: *Ставит вам одну звезду в Uber и сообщает коллегам, чтобы не подбирали вас*\n");
                }
    }
}
