package day41_Inheritance.Task2;

public class BankObject {

    public static void main(String[] args) {

        CheckingAccount check1 = new CheckingAccount();

        check1.accountHolder = "Izzatulloh Patidinov";
        check1.depositing(100000);
        check1.showBalance();
        System.out.println(check1);
        check1.withDraw(50000);
        System.out.println(check1);


        System.out.println("=-=============================================");

        SavingAccount save1 = new SavingAccount();

        save1.accountHolder = "Izzatulloh Patidinov";
        save1.depositing(1399999);
        save1.showBalance();
        System.out.println(save1.interestRate);
        save1.showBalance();


    }
}
