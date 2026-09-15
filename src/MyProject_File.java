

import java.util.Scanner;

public class MyProject_File {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int n = 5;
        char c = 'a';
        short s = 3245;
        float f = 10.2f;
        double d = 10.0;
        boolean b = true;

        //printf chara print kora
        System.out.println("n = " + n);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("b = " + b);

        //printf diye print kora
        System.out.println("Try same thing in java...");
        System.out.printf("n = %d\n", n);
        System.out.printf("b = %b\n", b);
        System.out.printf("f = %.1f\n", f);
        System.out.printf("d = %.3f\n", d);

        // user theke input niye print
        //import java.util.Scanner; = sacanner jonno upore eita lekha lgbe
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");

        number = input.nextInt();

        System.out.println(+number);

        System.out.printf("Enter two numbers: ");
        int n1, n2, result;

        n1 = input.nextInt();
        n2 = input.nextInt();

        result = n1 + n2;

        System.out.printf("Result = %d\n", result);

        int m;

        System.out.printf("Enter one number: ");

        m = input.nextInt();

        System.out.printf("Multi = %d\n", m * m);

        int t;

        System.out.printf("Enter temperature :");
        t = input.nextInt();

        t = ((9 / 5) * t) + 32;

        System.out.printf("In Fahrenheit :%d\n", t);

        char mw;

        System.out.printf("Enter your latter: ");
        mw = input.next().charAt(0);

        System.out.printf("%c\n", mw);

    }

}

