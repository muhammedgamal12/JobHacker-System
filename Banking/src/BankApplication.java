import java.util.Scanner;

public class BankApplication
{
    public static void main(String[] args) {


        Bank bank1=new Bank();
        Account account1=new Account(1,"Omar",65500.89);
        bank1.Addnewaccount(account1);
        Account account2=new Account(2,"Mohamed",54300.51);
        bank1.Addnewaccount(account2);
        Account account3=new Account(3,"Amira",14400.21);




        //bank1.Deposit(-4,2);
        SavingAccount savingaccount=new SavingAccount(1,"MARIAM",5444,0.30);
        bank1.Addsavingaccounts(savingaccount);
        System.out.println(savingaccount.CalculateInterestRate(account1.getAccountBalance()));

       //bank1.Deposit(100000,10);
       bank1.Withdraw(100000000,2);

        bank1.Displaybalance(account1.getAccountNumber());
        bank1.Displaybalance(account2.getAccountNumber());
        bank1.Displaybalance(account3.getAccountNumber());



    }

}