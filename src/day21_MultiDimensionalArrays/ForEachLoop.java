package day21_MultiDimensionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};

        for (int  eachElement: numbers){   // will execute four time

            System.out.print(eachElement+" ");


        }
        System.out.println();
        System.out.println("=======================================");

        String[] students = {"Muhtar", "Asia", "Izzatulloh", "Murodil"};

        for (String eachElements: students){
            System.out.print(eachElements+ " ");
        }

        System.out.println();
        System.out.println("======================================");

int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        for (int eachNumbers: arr1){
            if (eachNumbers < 5){
                continue;
            }
            System.out.print(eachNumbers+" ");
        }

        System.out.println();
        System.out.println("=============================");

        String sentence = "I love Vazira Komiljonova";
     String[] words = sentence.split(" ");

        for (String eachWord: words){
            System.out.print(eachWord+" ");
        }

        System.out.println();
        System.out.println("======================================");


    }
}
