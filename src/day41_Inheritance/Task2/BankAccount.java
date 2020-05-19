package day41_Inheritance.Task2;


/*
create a class called BankAccount
			variables:  accountNumber, accountHolder, Balance
			methods: deposit, showBalance, toString
 */
public class BankAccount {

    public long accountNumber;
    public String accountHolder;
    public double balance;


    public void depositing(int amount){

         balance+=amount; //       solution 1
    }



    public void showBalance(){
        System.out.println("Available Balance: $"+balance);
    }



    public String toString(){

        return "Full Name: "+accountHolder+", Balance: $"+balance;
    }

}
