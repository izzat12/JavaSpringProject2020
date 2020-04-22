package day_Unary_ShorthandOperators;

public class PrimitiveCastings {
    public static void main(String[] args) {

        //
        int a = 10;
        long b = a;        //implict casting automatically

       // int c = b;      // b is still long datatype

        int a1 = 100;
        long b1 = (long) a1;          //manually


       // int c1 = b1;

//////////////////////////////////////////////////////////////////////////

        // Explicit Casting

        int Inum = 100;
        byte Bnum = (byte)Inum;

        short Snum = (byte)Inum;

        double Dnum = 5.5;
        //float Fnum = Dnum;   //it can be compiler because float is smaller than double

      //  float Fnum = (float) Dnum;
          float Fnum = (int) Dnum;   // it will ignore double number.

        System.out.println(Fnum);


        double D1 = 10.5;
        long L1 = (int)D1;
        System.out.println(L1);
////////////////////////////////////////////////////////////////////////

        float f1 = 60.5f;
        int I1 = (int)f1;

        System.out.println(I1);


        long largeNum = 9999999999L;

        int intNum = (int) largeNum;
        System.out.println(intNum);      //it gives a different number because 999999999 is out of int range


        char ch1 = 'a';
        char ch2 = 12345;
        System.out.println(ch2);

        short sh1 = (short)ch1;
        System.out.println(sh1);

        ///////////////////////////////////////////////

        //local variables

        String name;
        name = "cybertek";

        System.out.println(name);









    }


}
