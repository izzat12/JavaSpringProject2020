package day29_Wrapper_ArrayList;

public class ParseMethod {
    public static void main(String[] args) {

        String str = "123";

      int a1 = Integer.parseInt(str);

        System.out.println(a1 + 1);  //number, addition: 124

        System.out.println(str+1);  // text, one added: 1231

//=================================================================

        byte b1 = Byte.parseByte(str);

        System.out.println(b1 + 4); //number

        Integer I1 = (int) Byte.parseByte(str); //AutoBoxing



    }
}
