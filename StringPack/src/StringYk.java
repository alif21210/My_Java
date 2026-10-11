import java.util.Locale;

public class StringYk {
    static void main() {

        String s1 = "Mehedi Hasan";
        String s2 = new String("Mehedi Hasan");
        char[] s3 = {'a','p','p','l','e'};

        System.out.println("s1 :"+s1);
        System.out.println("s2 :"+s2);
        System.out.println("s3 :"+new String(s3));

        int len = s1.length();
        System.out.println("Length of s1: "+len);

        if(s1.equals(s2)) // s1 ar s2 soman kina check kore
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        if(s1.contains("World")) // s1 vitore World lekha ta ache kina check kore
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        boolean b = s1.isEmpty();
        System.out.println("s1 string is empty :"+b);

        String firstname = "Amit";
        String lastname = " Hasan";

        String fullname = firstname + lastname;
        System.out.println("Fullname :"+fullname);

        String uppercase = fullname.toUpperCase();
        System.out.println("Uppercase :"+uppercase);

        String lowercase = fullname.toLowerCase();
        System.out.println("Lowercase :"+lowercase);

      // boolean check = firstname.startsWith("A"); first name A diye shuru hoiche kina check kore
        // boolean check firstname.endsWith("m");    last name m diye shuru hoiche kina check kore

        String country = "   I love Bangladesh  ";
        String c1 = country.trim(); //samne and pichoner space remove kore
        System.out.println(country);
        System.out.println(c1);

        String c2 = "Hello bhai kemon achen";
        String c3 = c2.replace('i','j');
        System.out.println(c3);

        String c4 = "Hello bhai kemon achen";
        String[] c5 = c4.split(" ");

        for(String x : c5)
        {
            System.out.println(x);
        }

        StringBuffer sb = new StringBuffer("Anisul");
        sb.append(" Islam ");
        sb.append(25);
        System.out.println(sb);


        StringBuffer sb1 = new StringBuffer("madam");
        String p1 = sb1.reverse().toString();
        if(p1.equals(sb1.toString())){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }


        StringBuilder smg = new StringBuilder("ALif");
        System.out.println("smg = "+smg);
        smg.append(" You know ");
        smg.append(8.76);
        System.out.println(smg);
        smg.delete(2,8);
        System.out.println("Afer delete: "+smg);


    }
}
