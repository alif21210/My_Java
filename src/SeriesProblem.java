

import java.util.Scanner;

public class SeriesProblem {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int i, n, flag=0;
        System.out.printf("Enter a number: ");
        n  = input.nextInt();


        for(i=2; i<n; i++)
        {
            if(n%i == 0)
            {
                flag++;
                break;
            }
        }

        if(flag == 0)
        {
            System.out.printf("prime\n");
        }
        else{
            System.out.printf("not prime\n");
        }

        for(i=1; i<=10; i++)
        {

            int y = n*i;
            System.out.printf("%d X %d = %d\n",n,i,y);
        }

    }


}
