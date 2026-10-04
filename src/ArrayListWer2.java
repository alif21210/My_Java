import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListWer2 {
    static void main() {

        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(10);
        number1.add(11);
        number1.add(12);

        System.out.println("Number1 List: "+number1);

        number2.add(20);
        number2.add(21);
        number2.add(22);

        System.out.println("Number2 List: "+number2);

        number3.addAll(number1); // number1 er sob value number3 te chole jabe
        System.out.println("Number3 List: "+number3);

        boolean result = number1.equals(number2);

        System.out.println("Number1 == Number2 :"+result);



        ArrayList<Integer> number4 = new ArrayList<>();

        number4.add(3);
        number4.add(13);
        number4.add(33);
        number4.add(-1);
        number4.add(14);

        System.out.println("Before sort: "+number4);

        Collections.sort(number4);
        System.out.println("Afer sort: "+number4); //asending order

        Collections.sort(number4,Collections.reverseOrder());
        System.out.println("Afer sort: "+number4); //desending order

    }
}
