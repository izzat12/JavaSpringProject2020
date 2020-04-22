package day13_StringClass;

public class stringManipulation {
    public static void main(String[] args) {

        String str = "CyberTek";
        //            01234567

        //String class methods: CharAt
      char ch1 = str.charAt(3);
        System.out.println(ch1 =='A');
/////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("----------------------------------------------");

        // String class method: Length
        int totalLength = str.length();
        System.out.println(totalLength);
        System.out.println(totalLength==10);

        String str2 = "Today is great day, Java is fun";

     ///Length continue....
        int maxIndexNum = str2.length() +5;
        System.out.println(maxIndexNum);
///////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("-----------------------------------------------------------");

        //String method: Concat(value);
        String s1 = "CyberTek";
       s1 = s1.concat(" School");      //cybertek school
        System.out.println(s1);

        //Concat(value); continue...
        String s2 = "Java";
        System.out.println( s2.concat (" is a programming language") );
        System.out.println(s2);

        s2 = s2.concat(" is a programming language");
        System.out.println(s2);

        String r1 = "Java is fun";
        r1.concat(", and it is easy");
        System.out.println(r1);
//////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("----------------------------------------------------------");
//          toLowerCase();    <---  String method

        String name1 = "CYBERTEK";
       name1 = name1.toLowerCase();
        System.out.println(name1);
//////////////////////////////////////////
        //   toUpperCase();

        String name2 = "cybertek school";
        name2 = name2.toUpperCase();
        System.out.println(name2);
        /////////////////////////////////////////////

        //       Trim();

             String A1 = "        Today          is a          great day";
            A1 = A1.trim();
        System.out.println(A1);







    }
}
