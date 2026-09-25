public class Constructor {
    String name,gender;
    int phone;

    // parameterized constructor
    Constructor(String n, String m, int p)
    {
        name = n;
        gender = m;
        phone = p;
    }

    // default constructor
    Constructor()
    {
        System.out.println("Hey boy!");
    }


    void displayinfo(){

        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println();

    }
}
