package com.company;

import java.util.Scanner;

public class Main {
    private static Envelope env;

    public static void main(String[] args) {
            for(;;) {
                try {
                    float [] arr = new float[4];
                    Envelope env= new Envelope();
                    Create();
                    Scanner input = new Scanner(System.in);
                    System.out.println("Continue? Input: YES");
                    if(!input.nextLine().toUpperCase().equals("YES")){
                        break;
                    }} catch (Exception ex) {
                    System.out.println(ex + "\n\tIncorrect input. ");
        }
        }
}

    private static void Task(float sideA, float sideB, float sideC , float sideD) {
        System.out.println("Can we input one inside another?");
        if (sideA > sideB && sideB > sideD) System.out.println("Answer: yes");
        else if (sideA > sideD && sideB > sideC) System.out.println("Answer: yes");
        else if (sideA < sideD && sideB < sideC) System.out.println("Answer: yes.");
        else if (sideA < sideC && sideB < sideD) System.out.println("Answer: yes");
        else {
            final double v = Math.pow(sideA, 2) + Math.pow(sideB, 2);
            double v1 = Math.pow(sideC, 2) + Math.pow(sideD, 2);
            if (v < v1)System.out.println("Answer: yes");
            else if (v > v1)System.out.println("Answer: yes");
            else System.out.println("Answer: no");
        }
    }

    private static Envelope Create()
    {
        float sideA, sideB, sideC, sideD;
        float [] arr = new float[4];
        for(;;) {
            try {
                Scanner w = new Scanner(System.in);
                for (int i = 0; i < arr.length; i++)
                {
                    System.out.println("Input the side of envelope: ");
                    arr[i] = w.nextFloat();
                }
                sideA = arr[0];
                sideB = arr[1];
                sideC = arr[2];
                sideD = arr[3];
                Envelope env= new Envelope();
                env.getArr(arr);
                Task(sideA,sideB,sideC,sideD);
                Scanner cont = new Scanner(System.in);
                System.out.println("Continue? Input: YES");
                if(!cont.nextLine().toUpperCase().equals("YES")){
                    break;
                }}

            catch (Exception ex) {
                System.out.println(ex + "\n\tIncorrect input. ");
            }

        }
    return env = new Envelope();
    }}