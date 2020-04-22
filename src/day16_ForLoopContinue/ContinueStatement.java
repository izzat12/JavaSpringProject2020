package day16_ForLoopContinue;

/*
        Continue Statement: MUST use in the loops
 */
public class ContinueStatement {
    public static void main(String[] args) {

        for(int i =1; i<=5; i++ ){

            System.out.print(i+ " ");

            if (i ==3){
                continue;
            }
        }

        System.out.println();

        for (int i =0; i <=20; i++){

            if (i%2 !=0){      //   Even number ||       in order to make ODD number -->   ==0
                continue;
            }

            /*    if(i%2==0){
                continue;             // skips all the even numbers
            }
            */

            System.out.print(i+ " ");

        }









    }
}
