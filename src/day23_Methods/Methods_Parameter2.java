package day23_Methods;

public class Methods_Parameter2 {

    /*
            create a function that reverse any string
     */

    public static void main(String[] args) {

        String names = "Izzatulloh";
        ReverseString(names);

        String names2 = "Vazira";
        ReverseString(names2);
    }

    public static void ReverseString(String str){

        for (int i = str.length()-1; i >=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
