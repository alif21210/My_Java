import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n;
        n = input.nextInt();

        int first = 0, second = 1;
        int fibo,i;
        System.out.printf("%d %d ",first,second);

        for(i=2; i<n; i++)
        {
            fibo = first + second;
            System.out.printf("%d ",fibo);

            first = second;
            second = fibo;
        }
    }
}
