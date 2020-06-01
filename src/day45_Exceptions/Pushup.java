package day45_Exceptions;

public class Pushup {

    public static void main(String[] args) {

        int pushups = 20;
        while(pushups <20){
            System.out.println("Push up"+pushups+1);
        }
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            pushups++;
        }

    }
}
