public class MathClass {
    static void main() {

        int x = Math.abs(-9);
        System.out.println("x: "+x);

        double y = Math.abs(-8.6);
        System.out.println("y: "+y);

        System.out.println("Abs: "+Math.abs(-56));
        System.out.println("Square: "+Math.sqrt(25));
        System.out.println("Power: "+Math.pow(5,2));

        System.out.println("Pie: "+Math.PI);
        System.out.println("Log: "+Math.log(2.0));
        System.out.println("Exponential: "+Math.exp(2.0));

        System.out.println("Maximum: "+Math.max(3,4));
        System.out.println("Minimum: "+Math.min(4, 5));
        System.out.println("Celing: "+Math.ceil(8.6));
        System.out.println("Floor: "+Math.floor(8.6));
    }
}
