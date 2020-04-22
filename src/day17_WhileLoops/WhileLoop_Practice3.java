package day17_WhileLoops;

public class WhileLoop_Practice3 {
    public static void main(String[] args) {

        /*
        for (int i =1; i <101; i++){
            System.out.print("* ");
        }

*/

        int i = 0;
        while (i < 100){
            System.out.print("*");
            i++;
        }
        System.out.println();

        System.out.println("********************************");
        int number = 3;
        while (number>0){
            System.out.println("* * * * * * * * * * * ");
            number--;
        }

        System.out.println("***********************************");



    }
}

