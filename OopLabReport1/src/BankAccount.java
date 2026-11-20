public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

     void deposit(double money)
    {
        System.out.println(money+" deposited successfully.");
        balance = balance + money;
    }

     void withdraw(double m)
    {
        if(m<balance)
        {
            System.out.println(m+" withdrawn successfully.");
            balance = balance - m;
        }
        else{
            System.out.println("Insufficient balance!");
        }
    }

    void displayAccount()
    {
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}
