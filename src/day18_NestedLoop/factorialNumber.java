package day18_NestedLoop;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        /*
        write a program that can return the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        long num  =  scan.nextLong();  // 0
        long result = 1; // 120

        while(num >= 1){
            // result *= num;
            result = result * num;

            num--;
        }
        System.out.println(result);











    }
}
