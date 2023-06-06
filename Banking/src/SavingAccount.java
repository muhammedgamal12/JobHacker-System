public class SavingAccount extends Account {

    private double interest_rate;



    protected double CalculateInterestRate(double accountbalance)
    {
      interest_rate = accountbalance*00.1;
     return interest_rate;
    }
}
