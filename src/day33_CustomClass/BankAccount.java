package day33_CustomClass;

public class BankAccount {

    String accountHolder;
    long AccountNumber;
    double balance;

    public void checkingBalance(){

        System.out.println("Available balance: "+balance);

    }

    public void withDraw (double amount){
        System.out.println("Withdrawing $"+amount);
        balance -=amount;
    }


    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance +=amount;

    }

    public String toString(){

        String result = "AccountHolder: "+accountHolder+ "\nAccount Number: "+AccountNumber+"\nAvailable Balance: "+balance;
        return result;
    }

}
