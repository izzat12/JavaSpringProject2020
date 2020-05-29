package day44_Exceptions;

public class try_and_catch2 {

    public static void main(String[] args) {

        System.out.println("Hello");

        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("something is wrong");
        }
        System.out.println("Hello again");
    }
}
