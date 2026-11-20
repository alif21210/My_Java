public class Test {

    static void main() {
        BankAccount obj1 = new BankAccount("Hasan",1001,20000.0);
        System.out.println();
        System.out.println("----- Bank Account Information -----");
        obj1.displayAccount();

        System.out.println();
        SavingsAccount obj2 = new SavingsAccount("Nabil",1002,50000,5.0);
        System.out.println("----- Savings Account Information -----");
        obj2.displayAccount();

        System.out.println();
        System.out.println("----- Transactions -----");
        obj1.deposit(5000.0);
        obj1.withdraw(2000.0);
        obj1.withdraw(343422.0);

        System.out.println();
        System.out.println("----- Updated Account Information -----");
        obj1.setAccountHolder("Alif");
        obj1.setAccountNumber(1003);
        obj1.setBalance(22000.0);
        obj1.displayAccount();



    }

}
