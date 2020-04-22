package day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        int[] n = new int[3];
        n[0] = 0;
        n[1] =1 ;
        n[2] =2;


        String[] months = {"Jan", "Feb", "Mar", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        int attempt = 0;

        while (num > 12 || num <=0){
            System.out.println("Invalid number");
            System.out.println("Please re-enter the number");
            num = input.nextInt();
            attempt++;

            if (attempt == 3 && (num > 12 || num <=0)){
                System.out.println("Invalid number, you already have 3 attempts");
                System.exit(0);
            }
        }


        String result = months[num-1];

        System.out.println(result);


    }
}
