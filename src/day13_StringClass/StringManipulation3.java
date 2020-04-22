package day13_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {

        //     indexOf(value);

        String str = "I like Java programming John";
             int number = str.indexOf("John");
        System.out.println(number);


        String str2 = "Cybertek school is awesome";
        int secondS = str2.indexOf("s");  /// 9
        int firstS = str2.indexOf("is") +1;
        System.out.println(firstS);

        int maxIndexNumber = "Cybertek".length();
        System.out.println(maxIndexNumber);


        String name = "izzat";
        int a1 = name.indexOf("Good Guy");        // -1 means INVALID
        System.out.println(a1);
/////////////////////////////////////////////////////////////////////////////////

        //      lastIndexOf():

        String fullName = "Izzat Patidinov";
        String firstName = fullName.substring(0, fullName.indexOf(" ") );
        String lastName = fullName.substring(fullName.indexOf(" ")+1 );

        System.out.println(firstName);
        System.out.println(lastName);






    }
}
