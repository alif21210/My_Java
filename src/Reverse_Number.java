
import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n, sum = 0;
        n = input.nextInt();

        while(n != 0)
        {
            int k = n%10;
            sum = sum+k;
            sum = sum*10;
            n = n/10;
        }

        sum = sum/10;
        System.out.println("Reverse number: "+sum);
    }

}

