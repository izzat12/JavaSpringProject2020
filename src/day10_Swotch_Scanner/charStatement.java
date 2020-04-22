package day10_Swotch_Scanner;

public class charStatement {
    public static void main(String[] args) {

        char ch = 'a';
        String result = "";

        switch (ch){
            case 'A':
                System.out.println("A");
                //result = "A";
                break;
            case 'B':
           System.out.println("B");
              //  result = "B";
                break;
            case 'C':
                System.out.println("C");
                //result = "C";
                break;
            case 'D':
               System.out.println("D");
               // result = " D";
                break;
            default:
          System.out.println("Invalid");
                //result = "Invalid";
        }
        System.out.println(result);

    }

}
