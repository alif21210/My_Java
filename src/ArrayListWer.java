import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWer {
    static void main() {

        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Number size: "+number.size());

        number.add(20);
        number.add(30);
        number.add(10);
        number.add(1,11);

        System.out.println(number);
        System.out.println("Number size: "+number.size());
        System.out.print("Print with for h loop: ");
        for(int m : number)
        {
            System.out.print(m+" ");
        }
        System.out.println();

        number.remove(1);
        // number.removeAll(number); sob gula man remove kore dey
        // number.clear(); sob gula man remove kore dey

        System.out.print("Print with iterator: ");
        Iterator itr = number.iterator();

        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

        System.out.println();

        boolean check = number.isEmpty(); // empty kina check kore
        System.out.println("Checking array empty or not: "+check);

        boolean find = number.contains(30); // 30 array modhay ache kina
        System.out.println("Is 30 in array?: "+find);

        int pos = number.indexOf(100);
        System.out.println("Index number of 10: "+pos);

        number.set(1,100); // 1 number index er value replace kora
        System.out.println("After replacing value: "+number);

        int x = number.get(0);
        System.out.println("0 index value: "+x);


    }
}
