public class TestEncapsulation2 {
    static void main() {
        Encapsulation2 asc = new Encapsulation2();
        asc.display();
        System.out.println("With getter function Country: "+asc.getCountry());
        System.out.println("With getter function Population: "+asc.getPopulation());

        asc.setCountry("India");
        asc.setPopulation(23421.2);

        asc.display();



    }
}
