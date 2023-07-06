
public class Account {

    private  int accountNumber;
    private String accountName;
    private double accountBalance;

    protected Account(int accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public Account() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }



    public double getAccountBalance() {
        return accountBalance;
    }

    protected void Deposit(double amount)
    {
     if (amount < 0)
     {
         System.out.println("Please add a positive amount");

     }
     else
        accountBalance +=amount;
    }

    protected void Withdraw(double amount)
    {
        if(amount >accountBalance)
        {
            System.out.println(" you don't have this amount in your account Please select" +
                    "another amount");
        }
        else {
            if (amount > 0)
                accountBalance -= amount;

        else{
                System.out.println("you must choose an amount more than Zero \"0\"");
            }
        }
    }


}
