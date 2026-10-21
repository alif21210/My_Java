public class NumberConversion {
    static void main() {

        int decimal = 15;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary :"+binary);

        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal :"+octal);

        String hexa = Integer.toHexString(decimal);
        System.out.println("Hexa :"+hexa);
    }
}
