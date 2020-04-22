package day06_Shorthand_LogicalOperators;

public class shortHandOp {
    public static void main(String[] args) {
// Addition warm-up for shorthand Operators

     int X = 20;
     X +=10;
        System.out.println(X);
        X +=60;
        System.out.println(X);

      String schoolname = "CyberTek";
      schoolname += 12345;
        System.out.println(schoolname);

        char ch1 = 'a';     //result will not be numbers
        ch1 += 'b';
        System.out.println(ch1);


     int num = 'z';
      num +='x';
        System.out.println(num);

        System.out.println("=============================================");
////////////////////////////////////////////////////////////////////////////////
        //multi warm up for shorthand Operators
int a = 2;
a *=3;
        System.out.println(a);

        int b =   a *= 10;
        // b = a = a * 10 = 60
        System.out.println(a);
        System.out.println(b);


        int a1 = 100;
        int b1 = ( a1*= 2) + ++a1;
        // b1 = 200 + 201
        System.out.println(b1);


        int x1 = 10;
        int y1 = x1 += 10*2;
        System.out.println(y1);


        int q = 20;
        int p = q *= 20*3;
        System.out.println(p);
        System.out.println("==========================================================");
//////////////////////////////////////////////////////////////////////////////

// warmup: subtraction - shorthand operators:

        int num1 = 300;
        num1 /=2;
        System.out.println(num1);

        int num2 = 400;
        num2 /= 20 +10;
        System.out.println(num2);
        ///////////////////////////////////////////////////////////////////////

//remainder for shorthand operators

        int num3 = 300;
        num3 %= 10 + 20;
        System.out.println(num3);
   



    }
}
