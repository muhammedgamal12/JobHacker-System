public class Account {

    private  int account_number ;
    private String Account_Name;
    private double Account_balance;

    protected Account(int account_number, String account_Name, double account_balance) {
        this.account_number=account_number;

        Account_Name = account_Name;
        Account_balance = account_balance;
    }

    public Account() {
    }

    public int getAccount_number() {
        return account_number;
    }

    public String getAccount_Name() {
        return Account_Name;
    }

    public void setAccount_balance(double account_balance) {
        Account_balance = account_balance;
    }

    public double getAccount_balance() {
        return Account_balance;
    }

    protected void Deposit(double amount)
    {
     Account_balance +=amount;
    }

    protected void Withdraw(double amount)
    {
        Account_balance -=amount;
    }


}
