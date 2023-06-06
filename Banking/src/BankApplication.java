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
        bank1.Addnewaccount(account3);

        System.out.println(bank1.toString());

        bank1.Deposit(500000,account3.getAccount_number());
        SavingAccount savingaccount=new SavingAccount();
        System.out.println(savingaccount.CalculateInterestRate(account1.getAccount_balance()));


        bank1.Displaybalance(account1.getAccount_number());
        bank1.Displaybalance(account2.getAccount_number());
        bank1.Displaybalance(account3.getAccount_number());


    }

}