package day19_Arrays;

public class Arrays_Practice {
    public static void main(String[] args) {

        String[] names = { "John", "Mike", "Jack", "Paul", "Adam" };
         // index number      0       1       2      3       4

        /*
        System.out.println(names[4]);

        String s1 = names[2];
        System.out.println(s1);
        */

        //to print all names

       for (int i = 0; i <=4; i++){
           String name = names[i];
           System.out.println(name);
       }

        System.out.println("===================================");
       String[] emails = {"izzat@gmail.com", "izzatbek@gmail.com", "izzat@yahoo.com", "izzat@hotmail.com", "izzat@outlook.com"};

       // print out all the users who registered with their gmail

        // Max number is 4

        for (int i = 0; i <=3; i++){

           String email = emails[i];
           if (email.endsWith("gmail.com")){
               System.out.println(email);
           }

        }









    }
}
