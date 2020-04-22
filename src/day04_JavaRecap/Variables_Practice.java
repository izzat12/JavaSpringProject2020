package day04_JavaRecap;

public class Variables_Practice {

    public static void main(String[] args) {

        //DataType variableName = data;
        //byte num2 = 129;  //out of the byte range
//        byte num1 = 100.3; //byte, short, long, int only takes whole numbers

  // double > float > long > int > short > byte

  byte num1 = 100;
  short s1 = num1;

            //byte num2 = s1;
     //   short s2 = 40000;
        int  num2 = s1;

        long l1 = 9999999999l;

        float f1 = 99999999999l;
        System.out.println(f1);

        float f2 = 100.2f;
        System.out.println(f2);

        double d1 = 15.5;
        System.out.println(d1);


        double d2 = 10;     /// 10.0

        double d3 = 100l;

        char ch1 = 'A';         //
        System.out.println(ch1);

        char ch2 = 45000;
        System.out.println(ch2);

        int a1 = 'a' + 'b';        // 97 + 98
        System.out.println(a1);

        double dnum = 'a' + 'b';
        System.out.println(dnum);    // shows only dacimal


        char char1 = 'a';




        boolean b1 = true;
        boolean b2 = false;
        System.out.println(10 > 5+5 );

        boolean result1 = 10 > 9;
        System.out.println( 10 >=10);
        System.out.println( 10 != 10);
        System.out.println("Corona " == "ebola");       //false
        System.out.println("ebola" != "corona");   //true

        System.out.println('a' !=97);

        System.out.println(!false );    //true


        boolean r1= true != !false;
        boolean r2 = !(9>10) != !(10>9);
        System.out.println(r2);


        boolean r3 = !!!true;
        System.out.println(r3);


















    }
}
