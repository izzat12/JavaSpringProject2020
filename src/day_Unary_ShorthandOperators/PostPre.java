package day_Unary_ShorthandOperators;

public class PostPre {

    public static void main(String[] args) {

        //Pre:     changes the value of the variable immediately

        int a = 100;
        System.out.println(++a);         //101
        System.out.println(a);

        int b = 100;
        System.out.println(--b);
        System.out.println(b);


        // Post: first passes the cvurrent value then eventually change the variable value

        int A = 100;
        System.out.println(A++);
        System.out.println(A);

        int B = 100;
        System.out.println(B--);
        System.out.println(B);

//pre and post examples:

        int x = 10;
        int z = ++x;
        System.out.println(z);


        int s = 10;
        int f = s++;

        System.out.println(f);
        System.out.println(s);


        double t1 = 3.5;
        double t2 = t1--;
        System.out.println(t2);    //current value
        System.out.println(t1);          //decrease by one


        int num = 25;

        System.out.println(num++); // current value
        System.out.println(num--);





    }
}
