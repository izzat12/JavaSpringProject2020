package day24_MethodsContinue;

public class StringReverse {
    public static void main(String[] args) {

    // String a = Reverse("Cybertek");

     String name = Reverse2("Izzatulloh");

        System.out.println(name);

    }


    public static void Reverse(String str){

        String Reverse = "";

        for (int i = str.length()-1; i >=0; i-- ){

            Reverse += str.charAt(i);
        }
        System.out.println(Reverse);
    }


    public static String Reverse2(String str){

        String Reverse = "";

        for (int i = str.length()-1; i >=0; i-- ){

            Reverse += str.charAt(i);

        }

        return Reverse ;
    }




}
