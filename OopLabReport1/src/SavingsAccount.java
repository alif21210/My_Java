public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(String accountHolder, int accountNumber, double balance, double interestRate) {
        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    double calculateInterest()
    {
        double r = (getBalance()*interestRate)/100;
        return r;
    }

    void displayAccount()
    {
        super.displayAccount();
        System.out.println("Interest rate: "+interestRate+"%");
        System.out.println("Interest: "+calculateInterest());
    }
}
