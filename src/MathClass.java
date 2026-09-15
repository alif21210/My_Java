package com.mycompany.myproject;

public class MathClass{
    public static void main(String[] args){
        int x = 10;
        int y = 5;
        int z = -9;

        int max = Math.max(x, y);
        System.out.printf("Maximum : %d\n", max);

        int min = Math.min(x, y);
        System.out.printf("Minimum : %d\n", min);

        double power = Math.pow(x,y);
        System.out.printf("Power : %.0f\n", power);

        int absolute = Math.abs(z);
        System.out.printf("absolute : %d\n", absolute);

        int round = Math.round(9.4f);
        System.out.printf("Round : %d\n", round);

        System.out.println(Math.PI);

    }
}