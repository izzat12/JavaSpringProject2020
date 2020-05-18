package day41_Inheritance;

public class BankOfAmerica {

    public static void main(String[] args) {

    BankAccount izzat = new BankAccount("Izzatulloh", "Patidinov");

        System.out.println(izzat.getAccountHolder() );

        System.out.println(izzat.getBalance() );

        izzat.checkBalance();
        izzat.depositing(200);
        izzat.checkBalance();
        izzat.withDrawing(100);
        izzat.checkBalance();
        System.out.println(izzat);
    }
}
