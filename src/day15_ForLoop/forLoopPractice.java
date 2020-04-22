package day15_ForLoop;

public class forLoopPractice {
    public static void main(String[] args) {

        /*
        write a programm that print
                  1-100 in a single line seperated by a space
                   ~   odd number :   1,3,5,7,9
                   ~   even number : 2,4,6,8,10

                   MUST use FOR Loop statement
         */

        String resultOdd = " ";

        for(int number =1; number <=100; number +=2){        // ODD number
          //  System.out.print(number + " ");
          //  resultOdd += number+ " ";
            resultOdd = resultOdd + number + " ";
        }
        System.out.println(resultOdd);


        // Even number

        String resultEven = " ";
        for(int num = 2; num<=100; num+=2) {

            resultEven +=num+ " ";

        }
        System.out.println(resultEven);

    }
}
