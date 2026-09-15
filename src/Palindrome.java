
import java.util.Scanner;
public class Palindrome
{
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");

        int n, sum = 0;
        n = input.nextInt();

        int m = n;

        while(n != 0)
        {
            int k = n%10;
            sum = sum+k;
            sum = sum*10;
            n = n/10;
        }

        sum = sum/10;

        if(sum == m)
        {
            System.out.println("Palindrome");
        }

        else{
            System.out.println("Not Palindrome");
        }
    }
}
