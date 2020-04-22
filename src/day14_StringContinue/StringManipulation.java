package day14_StringContinue;

public class StringManipulation {
    public static void main(String[] args) {

        //      indexOf();
        String  str = " I love J to learn Java. I like to watch the movie name called Jumanji";

        int a1 = str.indexOf("J");       // always return the index number of first matching one
        System.out.println(a1);

       int a2 = str.indexOf("Jum");
        System.out.println(a2);

        int a3 = str.indexOf("I") + 1 ;
        System.out.println(a3);
   ////////////////////////////////////////////////////////////////////////

        //   lastIndexOf();

     String last = "I love Java, and I love reading" ;

      int b1 = last.lastIndexOf("l");   //any word will return the last word as index number.
        System.out.println(b1);

////////////////
        String z = "I like C#, C# is cool";
        int c1 = z.lastIndexOf("C");
        System.out.println(c1);

//////////////
        String a = "I love Java, Java is loveable, Java is fun";
        int d1 = a.indexOf("Java is");
        System.out.println(d1);

        int d2 = a.indexOf(", J")+2;
        System.out.println(d2);

        int d3 = a.lastIndexOf("J");
        System.out.println(d3);

        char ch1 = a.charAt(31);
        System.out.println(ch1);



    }
}
