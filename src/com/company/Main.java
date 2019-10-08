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
                    Scanner k = new Scanner(System.in);
                    System.out.println("Continue?! Input: YES");
                    if(!k.nextLine().toUpperCase().equals("YES")){
                        break;
                    }} catch (Exception ex) {
                    System.out.println(ex + "\n\tIncorrect input. ");
        }
        }
}

    private static void Task(float a, float b, float c, float d) {
        System.out.println("Can we input one inside another?");
        if (a > c && b > d) System.out.println("Answer: yes");
        else if (a > d && b > c) System.out.println("Answer: yes");
        else if (a < d && b < c) System.out.println("Answer: yes.");
        else if (a < c && b < d) System.out.println("Answer: yes");
        else if (Math.pow(a,2)+Math.pow(b,2)<Math.pow(c,2)+Math.pow(d,2))System.out.println("Answer: yes");
        else if (Math.pow(a,2)+Math.pow(b,2)>Math.pow(c,2)+Math.pow(d,2))System.out.println("Answer: yes");
        else System.out.println("Answer: no");
    }

    private static Envelope Create()
    {
        float a, b, c, d;
        float [] arr = new float[4];
        for(;;) {
            try {
                Scanner w = new Scanner(System.in);
                for (int i = 0; i < arr.length; i++)
                {
                    System.out.println("Input the number: ");
                    arr[i] = w.nextFloat();
                }
                a = arr[0];
                b = arr[1];
                c = arr[2];
                d = arr[3];
                Envelope env= new Envelope();
                env.getArr(arr);
                Task(a,b,c,d);
                Scanner k = new Scanner(System.in);
                System.out.println("Continue? Input: YES");
                if(!k.nextLine().toUpperCase().equals("YES")){
                    break;
                }}

            catch (Exception ex) {
                System.out.println(ex + "\n\tIncorrect input. ");
            }

        }
    return env = new Envelope();
    }}