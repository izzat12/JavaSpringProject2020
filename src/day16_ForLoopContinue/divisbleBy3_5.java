package day16_ForLoopContinue;
/*
1. write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5

2. write a program that can print all the EVEN numbers between 1 ~ 100 that can be divisible by 3 & 5
 */
public class divisbleBy3_5 {
    public static void main(String[] args) {

        for (int i = 1; i<=100; i++) {

            // if condition is true    --> == equal  if the number is even, it will past to another condition to check
            if (i % 2 == 0) {

                // if the condition is true, it will run.
                if (i % 3 ==0 && i % 5 ==0){

                System.out.print(i + " ");
            }
        }}




    }
}
