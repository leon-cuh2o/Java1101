package com.cuh2o.java1101_.HW2.HW2_10;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SayMyName {
    public static void main(String[] args) throws Exception {
        System.out.println("Walt: You know. You all know exactly who I am. Say my name.");
        System.out.println("You: What? I don't have a damn clue who the hell you are.");
        System.out.println("Walt: Yeah, you do. I'm the cook. I'm the man who killed Gus Fring.");
        System.out.println("You: Bullshit. Cartel got Fring.");
        System.out.println("Walt: Are you sure? That's right. Now. Say my name.");
        System.out.print("Write here his name ASAP –> ");
        BufferedReader reader2 = new BufferedReader((new InputStreamReader(System.in)));
        String Name2 = reader2.readLine();
            if (Name2.equals("Heisenberg")) {
                System.out.println("Walt: You're goddamn right.");
                }
            else
                {
                System.out.println("Walt: I'm sorry, but your kids will never see you again. *Gun sounds*");
                }
        }
    }