package day10_Swotch_Scanner;

public class localVariables {

    public static void main(String[] args) {

      int a =0;
      if(true){
          System.out.println(a);
          int b = 10;
      }

  switch (3){
      case 1:
          int c =100;
      case 2:
        //  System.out.println(c);     ---> the local variable c belongs to the case block
  }


      if (9> 10){
          int t = 100;
      }else if(11>10){
          int y = 200;
      }else if(12>10){
          int t =300;
          System.out.println(t);
      }




















    }



}
