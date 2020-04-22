package day18_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {


        for (int j =0; j<10; j++) {


            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");

            }

            System.out.println();



        }
        System.out.println("====================================================");

      for (int i =0; i<7; i++) {     //       7 time repeated         outter loop repeating the inner loop over and over again

          int a = 1;
          while (a <= 30) {



              System.out.print("*");     //    30 of *
              a++;
          }
          System.out.println();
      }



    }
}
