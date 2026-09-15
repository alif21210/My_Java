public class Test {
    static void main() {
        Teacher teacher1 = new Teacher();

        /* eivabeo info set kora jay

            teacher1.name = "Mehedi Hasan";
            teacher1.gender = "Male";
            teacher1.phone = 1232434;
         */

        teacher1.setinfo("Mehedi Hasan","Male",1232434);
        teacher1.display();

        /* eivabeo print kora jay

        System.out.println("Name = "+teacher1.name);
        System.out.println("Gender = "+teacher1.gender);
        System.out.println("Phone = "+teacher1.phone);

        */

        System.out.println();


        Teacher teacher2 = new Teacher();

        /* eivabeo info set kora jay
            teacher2.name = "Amit Hasan";
            teacher2.gender = "Male";
            teacher2.phone = 234322;
        */

        teacher2.setinfo("Amit Hasan","Male",234322);
        teacher2.display();

        /* eivabeo print kora jay

        System.out.println("Name = "+teacher2.name);
        System.out.println("Gender = "+teacher2.gender);
        System.out.println("Phone = "+teacher2.phone);

        */
    }

}
