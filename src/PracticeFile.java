import java.util.Scanner;

public class PracticeFile{
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n;
        n = input.nextInt();
        int[] arr = new int[n];
        int i,j,temp;

        System.out.print("Enter your numbers: ");
        for(i=0; i<n; i++)
        {
            arr[i] = input.nextInt();
        }

        for(i=0; i<n; i++)
        {
            for(j=0; j<n-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}