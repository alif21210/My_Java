import java.util.Scanner;

public class ArrayTwoDimension {
    static void main() {

        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;
        int i,j;

        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        int[][] carray = new int[2][2];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter four digits A matrix:\n");

        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                System.out.printf("A[%d][%d]: ",i,j);
                carray[i][j] = input.nextInt();
            }
        }


        int[][] barray = new int[2][2];
        System.out.print("Enter four digits B matrix:\n");

        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                System.out.printf("B[%d][%d]: ",i,j);
                barray[i][j] = input.nextInt();
            }
        }

        int[][] sum = new int[2][2];
        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {

                sum[i][j] = barray[i][j] + carray[i][j];
            }
        }

        System.out.println("A MATRIX:");
        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("B MATRIX:");
        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                System.out.print(carray[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("SUM OF A & B: ");
        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
