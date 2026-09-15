import java.util.Scanner;
public class Pattern {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");

        int n = input.nextInt();

        int i,j;

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
