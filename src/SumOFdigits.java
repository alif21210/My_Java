


import java.util.Scanner;
public class SumOFdigits {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");

        int n,i,sum=0;
        n = input.nextInt();

        while(n != 0)
        {
            int m = n%10;
            n = n/10;

            sum = sum + m;
        }

        System.out.printf("Sum = %d",sum);

    }
}
