public class Practice3 {
    static int a;
    static int b;
    static int c;

     void display1()
    {
        System.out.println("Hello vai");
        display2();
    }

    void display2()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static void main() {
        a = 10;
        b = 20;
        c = 30;

        Practice3 obj = new Practice3();
        obj.display1();
    }
}
