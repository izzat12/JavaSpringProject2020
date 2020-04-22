package day21_MultiDimensionalArrays;

public class Emails {
    public static void main(String[] args) {

        /*
Task:
    given an array:
        String[] emails = {"userName@gmail.com", "userName@yahoo.com", "userName@hotmail.com", "userName@outlook.com"}
                            elements could be more in the array
                            print all the email addresses excluding the gmail addresses
                            NOTE: MUST USE FOR EACH LOOP
         */

        String[] emails = {"Izzatulloh@gmail.com", "Izzatulloh@yahoo.com", "Izzatulloh@hotmail.com", "Izzatulloh@outlook.com"};

        for (String eachEmail: emails){
            if (eachEmail.endsWith("@gmail.com")){
                continue;
            }
            System.out.println(eachEmail);
        }







    }
}
