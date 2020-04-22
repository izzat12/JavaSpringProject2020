package day_Unary_ShorthandOperators;

public class PostPrePractice {
    public static void main(String[] args) {

        int a = 50;
        a = --a + a++ + a-- + a++;
        // 49 + 49 + 50 =
        System.out.println(a);

        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        ///////////////////////////////////////////////////////////


        int b = 1;
        b = -b-- + b++ / -b-- * --b;
        // = -1 + 0 / - 1 * -1
          // -1 + 0 * -1

        System.out.println(b);

    }


}
