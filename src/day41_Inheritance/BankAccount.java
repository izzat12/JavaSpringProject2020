package day41_Inheritance;

/*
create costum class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)

	 	create a constructor that can initialize firstName and fullName
	 		    (DO NOT USE SHORTCUT)

	 	action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
 */
public class BankAccount {

    public static String bankName = "Bank of America"; /// default
   public String firstName;
   public String lastName;

   private String accountHolder;
   private long AccountNumber;
   private double balance;


   public BankAccount(String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName;
       this.accountHolder = firstName +" "+lastName;


   }



   public String getAccountHolder(){

       return accountHolder;
   }

   public void setAccountHolder(String firstName, String lastName){ //in order to initialize we need to give parameter..

       this.accountHolder = firstName+" "+lastName;
   }


    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    //balance: 100;
    //depositing: 20;
    //new balance: 120;

    public void depositing(int amount){

      // balance+=amount; //       solution 1
        setBalance(balance+amount); //  solution 2
    }


    public void withDrawing(int amount){

       //balance -=amount;
        setBalance(balance-=amount);
    }


    public void checkBalance(){
        System.out.println("Available Balance: $"+getBalance());
    }


    public String toString(){

       return "Full Name: "+getAccountHolder()+", Balance: $"+getBalance();
    }

}
