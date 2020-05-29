package day44_Exceptions;

public class Pratice {

    /*
    print hello, then two second print Cybertek, then wait three second
     */
    public static void main(String[] args) {

        System.out.println("Hello");

        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
        System.out.println("Cybertek");
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }

        System.out.println("Java");

        try {
            Thread.sleep(4000);
        }catch (Exception e){
        }

        System.out.println("Completed");

    }

}
