public class Student {
    String name;
    int id;
    static String Uniname = "DIU";

    String book = "OOP Learning"; // non static variable

    Student(String n,int i)
    {
        name = n;
        id = i;
    }

    void  displayinfo()
    {
        System.out.println("Name :"+name);
        System.out.println("ID :"+id);
        System.out.println("University :"+Uniname);
    }
}
