package day41_Inheritance.Task2;

/*
create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance
 */
public class CheckingAccount extends BankAccount {

    public void withDraw(int amount){

        balance -=amount;
    }

}
