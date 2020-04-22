package day18_NestedLoop;

public class evenNumber {
    public static void main(String[] args) {

        /*
        write a program that print all the even number from 1-10 seperated by space
                MUST use DO WHILE loop
         */
        int number = 0;     // starting point

        do{
            if (number % 2 ==0) {
                System.out.print(number + " ");
            }
            number++;
        }while (number<=100);

        System.out.println();
        System.out.println("=======================================");

        int i = 1;
        do {

            i++;      // start from 2
            System.out.println(i);

        }while (i <=5);

        System.out.println("==============================");

        
        int z = 1;
        do {
            System.out.println(z);
            if (z ==3){
                break;
            }
            z++;
        }while (z<=5);


    }
}
