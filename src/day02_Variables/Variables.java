package day02_Variables;

public class Variables {

    public static void main(String[] args) {

        System.out.println("Length is: 10");
        System.out.println("Width is: 20");

         byte l = 10;
         byte w = 20;
        System.out.println(l);
        System.out.println(w);

      //  byte l1 = 128 out of the range

        short s1 = 400;

        //short s2 = 10000; out of the range

        int i1 = 100000;
        long b = 999999l;
        long k = 99999999L;
        System.out.println( 9999999999999l);

      byte byteNum = 100;
      short shortNum = byteNum;

     // byte byteNum2 = shortNum;  <--it doesnt contain

        int intNum = shortNum;

        //GDP: 0.035

        double decimalNum = 0.5;         //prefered by compiler larger than float
        float decimalNum2 = 0.5f;        //float f1 = 10.5f;       <--
        System.out.println( 0.5 );

        ///////////////////////////////////////////////////////////////////////////////////////////////////////

        int score = 100;
        float floatNum = score;
        double doubleNum = floatNum;


        System.out.println(score);   //100
        System.out.println( floatNum );       // result is 100.0
        System.out.println( doubleNum);          // result is 100.0

        int A123 = 100;
       // int




    }

}
