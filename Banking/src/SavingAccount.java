public class SavingAccount extends Account {

    private double interest_rate;


    public SavingAccount(int accountNumber, String accountName, double accountBalance, double interest_rate) {
        super(accountNumber, accountName, accountBalance);
        this.interest_rate = interest_rate;
    }

    protected double CalculateInterestRate(double accountbalance)
    {
      interest_rate = accountbalance*00.1;
     return interest_rate;
    }

    public double getInterest_rate() {
        return interest_rate;
    }
}
