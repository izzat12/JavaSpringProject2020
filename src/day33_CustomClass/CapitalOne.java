package day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Izzat = new BankAccount();

        Izzat.accountHolder = "Izzat";
        Izzat.AccountNumber = 443433234234234l;

        Izzat.checkingBalance();
        Izzat.deposit(50);

        Izzat.checkingBalance();
        Izzat.withDraw(20);

        Izzat.checkingBalance();
        Izzat.withDraw(40);

        Izzat.checkingBalance();

        System.out.println("===============================");

        System.out.println(Izzat);

    }
}
