public class Payment {
    public int n;
    public int r;

    Payment(int ni, int ri){
        n = ni;
        r = ri;
    }

    void payBill()
    {
        System.out.println("Pay Bill amount: "+n);
    }
    void refund(){
        System.out.println("Refund amount: "+r);
    }

    void display1(){
        System.out.println("Processing Credit Card Payment");
        System.out.println("Processing Mobile Banking Payment");
        System.out.println("Processing Cash Payment");
    }

    void diplay2(){
        System.out.println("Final Balance: "+(n+r));
    }


    static void main() {
        Payment obj = new Payment(5000,2000);

        obj.display1();
        obj.payBill();
        obj.refund();
        obj.diplay2();
    }
}
