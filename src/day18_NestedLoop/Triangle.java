package day18_NestedLoop;

public class Triangle {
    public static void main(String[] args) {

        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
         */

        int z = 1;
        while (z<=7) {


            int i = 1;
            while (i <= z) {

                System.out.print("* ");
                i++;
            }
            System.out.println();

            z++;
        }
        System.out.println("=====================================");

        int a = 7;
        while (a>=1) {


            int b = 1;
            while (b <= a) {

                System.out.print("* ");
                b++;
            }
            System.out.println();

            a++;
        }













    }
}
