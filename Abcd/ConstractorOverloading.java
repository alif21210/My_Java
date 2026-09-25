package Abcd;

public class ConstractorOverloading {
    String name, gender;
    int phone;

    ConstractorOverloading()
    {
        System.out.println("No information");
    }

    ConstractorOverloading(String n, String g)
    {
        name = n;
        gender = g;
    }

    ConstractorOverloading(String n, String g, int p)
    {
        name = n;
        gender = g;
        phone = p;
    }

    void displayinfo()
    {
        System.out.println("Name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Phone :"+phone);
    }
}
