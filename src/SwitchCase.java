

import java.util.Scanner;

public class SwitchCase{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter your digit: ");
        int digit = input.nextInt();

        switch(digit){

            case 0:
                System.out.printf("Zero\n");
                break;
            case 1:
                System.out.printf("One\n");
                break;
            case 2:
                System.out.printf("Two\n");
                break;
            case 3:
                System.out.printf("Three\n");
                break;
            case 4:
                System.out.printf("Four\n");
                break;
            case 5:
                System.out.printf("Five\n");
                break;
            case 6:
                System.out.printf("Six\n");
                break;
            case 7:
                System.out.printf("Seven\n");
                break;
            case 8:
                System.out.printf("Eight\n");
                break;
            case 9:
                System.out.printf("Nine\n");
                break;
            default:
                System.out.printf("Digit not found!\n");
        }
    }
}
