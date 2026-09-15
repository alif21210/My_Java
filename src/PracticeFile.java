
import java.util.Scanner;

public class PracticeFile{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        char m;

        System.out.printf("Enter your number: ");
        m = input.next().charAt(0);

        if(m == 'a' || m == 'e' || m == 'i' || m == 'o' || m == 'u')
        {
            System.out.printf("vowel\n");
        }
        else{
            System.out.printf("consonant\n");
        }
    }
}