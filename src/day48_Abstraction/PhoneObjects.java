package day48_Abstraction;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("X", 1000, "10 inches");
        System.out.println(iphone+"...");

        System.out.println("==============================================");

        Iphone iphone2 = new Iphone("9",970,"9 inches");
        System.out.println(iphone2+"...");

        System.out.println("-----------------------------------------------------");

        iphone.faceTime(44365534988l);
        iphone2.calling(44365534988l);
        iphone.texting(44365534988l);


        System.out.println("==========================================================");


        Samsung samsung1 = new Samsung("Note10 Plus", 1200,"Large");
        System.out.println(samsung1);

    }


}
