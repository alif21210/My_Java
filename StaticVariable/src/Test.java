public class Test {
    static void main() {
        Student s1 = new Student("Alif", 876);
        Student s2 = new Student("Nahid", 858);

        s1.displayinfo();
        s2.displayinfo();

        System.out.println("Non static variable value: "+s1.book); //non static
        System.out.println("Non static variable value: "+Student.Uniname); // static
    }
}
