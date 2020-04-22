package day_Unary_ShorthandOperators;

public class unaryOp {
    public static void main(String[] args) {

        int a = 10;     //positive 10
        int b = +a;     // positive 10

        System.out.println(a);
        System.out.println(b);


        int a1 = -10;
        boolean result1 = a1 > 0;
        System.out.println(result1);     //false

        int x1 = -10;
        int y1 = -x1;

        System.out.println(y1);



        int x2 = +10;
        int y2 = -x2;
        System.out.println(y2);


        int x3 = +30;
        int y3 = +x3;
        System.out.println(y3);



        int Z = 100;

        System.out.println(++Z);   // increase it immediately
        System.out.println(Z);


        int P = 100;

        System.out.println(P++);       // first passes the current value
        System.out.println(P);          //increase by 1












    }


}
