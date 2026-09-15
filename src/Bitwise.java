
package com.mycompany.myproject;
import java.util.Scanner;
public class Bitwise {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x,y,c;
        System.out.printf("Enter x and y: ");
        x = input.nextInt();
        y = input.nextInt();

        c = x & y;

        System.out.printf("x & y: %d\n", c);

        c = x | y;

        System.out.printf("x | y: %d\n", c);

        c = x ^ y;

        System.out.printf("x ^ y: %d\n", c);

        System.out.printf("Enter a: ");
        int a;

        a = input.nextInt();

        c = a>>2;

        System.out.printf("a>>2 : %d\n", c);

        c = a<<3;

        System.out.printf("a<<2 : %d\n", c);

    }
}

