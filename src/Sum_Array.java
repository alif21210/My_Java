import java.util.Scanner;
public class Sum_Array {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int sum=0,i,n = input.nextInt();
        int[] array = new int[n];

        for(i=0; i<n; i++)
        {
            array[i] = input.nextInt();
            sum = sum + array[i];
        }


        System.out.println("Sum = "+sum);
        System.out.println("Average = "+sum/n);

    }
}
