package day42_Inheritance;


public class Data {

    public static String publicData = "public";

    protected static String protectedData = "protected";

    static String defaultData = "Default";

    private String privateData = "private";


    static class Testing extends Data{

        public static void main(String[] args) {

            System.out.println(Testing.defaultData);
            System.out.println(Testing.publicData);
          //  System.out.println(Testing.private);
            System.out.println(Testing.protectedData);



        }

    }

}
