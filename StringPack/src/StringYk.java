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

      //  boolean check = firstname.startsWith("A"); first name A diye shuru hoiche kina check kore
        // boolean check firstname.endsWith("m");    last name m diye shuru hoiche kina check kore
    }
}
