import java.util.ArrayList;

public class Bank {


    ArrayList<Account> bankaccounts=new ArrayList<Account>();


    protected void Addnewaccount(Account account)
    {
     bankaccounts.add(new Account(account.getAccount_number(),account.getAccount_Name(),account.getAccount_balance()));
    }

    protected void Deposit(double amount,int accountnumber) {
        for (Account a : bankaccounts) {
            if (a.getAccount_number() == accountnumber) {
              a.setAccount_balance(a.getAccount_balance()+amount);

            }
        }
    }
    protected void Withdraw(double amount,int accountnumber)
        {
            for (Account a : bankaccounts) {
                if (a.getAccount_number() == accountnumber) {
                    System.out.println(a.getAccount_balance());
                }
            }
        }
    @Override
    public String toString() {
        return "Bank{" +
                "bankaccounts=" + bankaccounts +
                '}';
    }

    protected void  Displaybalance(int accountnumbers){
        for (Account a: bankaccounts ) {
            if (a.getAccount_number()==accountnumbers){
                System.out.println(a.getAccount_balance());
            }

        }
    }




}
