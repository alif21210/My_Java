

import java.util.Scanner;

public class ConditionalOperator{
    public static void main(String[] args)
    {
        int x,y;

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter x and y : ");
        x = input.nextInt();
        y = input.nextInt();

        int m = (x>y) ? x : y; // condition true hoile first dukbe mane x false hoile y a dukbe
        System.out.printf("Greater number is: %d\n", m);
    }
}