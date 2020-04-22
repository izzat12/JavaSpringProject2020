package day13_StringClass;

public class StringManipulation2 {
    public static void main(String[] args) {

//String method -->     Substring();

        String str = "Cybertek is the best school";
        String schoolName = str.substring(0,8);
        System.out.println(schoolName);


        String fullName = "Izzat Patidinov";
         //                012345678910111214
        String firstName = fullName.substring(0,5);
        String lastName = fullName.substring(6,15);      // if String index out of range. it gives ERROR
        System.out.println(firstName);
        System.out.println(lastName);

        //write a program V               MUST use substring string class method
        //   Full name = first name + lastName
        //gmail.com -    lastName+firstName@gmail.com

        String izzat = "Izzatulloh patidinov";
             //         0123456789 10,11,12,13,14,15,16,17,18

        String name1 = izzat.substring(0,10);
        String name2 = izzat.substring(11,19+1);
        System.out.println(name1);
        System.out.println(name2);

      //  String gmail = name2.concat("_").concat(name1);
 //       System.out.println(gmail);

        String gmail = name1 + ""+name2 +"@gmail.com";
        System.out.println(gmail);

///////////////////////////////////////

        //        Replace() < --------- String class method
        String sr2 = "I love Java Programming Language";
        sr2 = sr2.replace("Java", "C++");
        System.out.println(sr2);


        String name = "CoronaVirus 18";
        name = name.replace("8","9");
        System.out.println(name);

        String r1 ="I like C++, C++ is fun, and C++ is cool";
        r1 = r1.replace("C++","Java");        //replaceFirst is only replce one C+= first one
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow", "Today");
        System.out.println(r2);





    }
}
