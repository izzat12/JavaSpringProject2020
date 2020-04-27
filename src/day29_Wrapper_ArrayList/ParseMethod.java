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
    //=============================================================

        String str2 = "10.5";

      float f1 = Float.parseFloat(str2);

        System.out.println(f1+3); //numbers primitive

        double f2 = Float.parseFloat(str2);
        System.out.println(f1+f2);

//===================================================================

        String str3 = "123456789";

        long l1 = Long.parseLong(str3);
        System.out.println(l1 +1);

//================================================

        String result = "TrUe";

        boolean bol1 = Boolean.parseBoolean(result);
        System.out.println(bol1);

//================================================

        String result2 = "faLsE";

        boolean bol2 = Boolean.parseBoolean(result2);




    }
}
