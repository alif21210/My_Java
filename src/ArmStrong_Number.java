
import java.util.Scanner;
public class ArmStrong_Number {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n;
        n = input.nextInt();
        int m = n, sum = 0;
        while(m != 0)
        {
            int k = m%10;
            m = m/10;

            int r = (int) Math.pow(k,3);
            sum = sum + r;
        }

        if(sum == n)
        {
            System.out.println("Arm Strong");
        }
        else{
            System.out.println("Not Arm Strong");
        }
    }

}
