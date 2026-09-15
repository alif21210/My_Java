
import java.util.Scanner;
public class Array {
    public static void main(String[] args)
    {
        int[] number = new int[5];

        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        for(int i =0; i<5; i++) {
            System.out.print(number[i] + " ");
        }

        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int j,n = input.nextInt();

        int[] array = new int[n];

        for( j=0; j<n; j++)
        {
            array[j] = input.nextInt();
        }

        for( j=0; j<n; j++)
        {
            System.out.print(array[j]+" ");
        }
        System.out.println();
    }
}
