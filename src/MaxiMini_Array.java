import java.util.Scanner;

public class MaxiMini_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int i,n = input.nextInt();
        int[] arr = new int[n];



        for(i=0; i<n; i++)
        {
            arr[i] = input.nextInt();
        }

        int maxi=arr[0], mini=arr[0];

        for(i=1; i<n; i++)
        {
            if(maxi<arr[i])
            {
                maxi = arr[i];
            }

            if(mini > arr[i])
            {
                mini = arr[i];
            }

        }

        System.out.println("Maximum = "+maxi+" Minimum = "+mini);

    }
}
