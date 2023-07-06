import java.util.ArrayList;

public class Bank {


    ArrayList<Account> bankaccounts=new ArrayList<Account>();


    protected void Addnewaccount(Account account)
    {
     bankaccounts.add(new Account(account.getAccountNumber(),account.getAccountName(),account.getAccountBalance()));
    }
    public  void Addsavingaccounts(SavingAccount account){
        bankaccounts.add(new SavingAccount(account.getAccountNumber(),
                account.getAccountName(),
                account.getAccountBalance(),
                account.getInterest_rate()));
    }

    protected void Deposit(double amount,int accountnumber) {
        if(amount >0 ) {

                Account a=Searchaccounts(accountnumber);
                if (a!=null) {
                    bankaccounts.set(bankaccounts.indexOf(a), new Account(accountnumber, a.getAccountName(), a.getAccountBalance() + amount));
                }
            else  {
                System.out.println("You don't have any account in our bank ");
            }
        }
        else {
            System.out.println("the amount should be larger than zero Please try again");
        }
    }
    protected void Withdraw(double amount,int accountnumber) {
        Account a = Searchaccounts(accountnumber);
        if (a != null) {
            if (amount > 0 ) {
            if (amount <= a.getAccountBalance()){
                bankaccounts.set(bankaccounts.indexOf(a),new Account(accountnumber,
                        a.getAccountName(),a.getAccountBalance()-amount));
            }
            else {
                System.out.println("you don't have this amount in your Account");
            }

            } else {
                System.out.println("you must choose amount larger than zero");
            }

        }
        else {
            System.out.println("This account doesn't exist");
        }
    }

        protected  Account Searchaccounts(int accountnumber){
        Account account = null;
            for (Account a : bankaccounts) {
                if (a.getAccountNumber() == accountnumber) {
                    account = a;
                    break;
                }
            }
         return account;
        }
    @Override
    public String toString() {
        return "Bank{" +
                "bankaccounts=" + bankaccounts +
                '}';
    }

    protected void  Displaybalance(int accountnumbers){
        for (Account a: bankaccounts ) {
            if (a.getAccountNumber()==accountnumbers){
                System.out.println(a.getAccountBalance());
            }

        }
    }




}
