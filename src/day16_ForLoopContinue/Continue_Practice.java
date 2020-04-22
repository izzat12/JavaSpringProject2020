package day16_ForLoopContinue;

public class Continue_Practice {
    public static void main(String[] args) {

        for (char ch = 'Z'; ch>='A'; ch--){

            if (ch == 'Y' || ch=='H' || ch=='J' || ch=='D'){
                continue;
            }
            System.out.print(ch+ " ");

        }


        for (int i = 1; i<=100; i++){
            if (i % 3 == 0 || i % 5 == 0){
                continue;
            }
            System.out.print(i+ " ");
        }



    }
}
