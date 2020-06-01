package day45_Exceptions;

class BreakTimeException extends RuntimeException{     // custom unchecked exception

    public BreakTimeException(){
        super("Its break time, we should take break");
    }
    public  BreakTimeException(String str){
        super(str);
    }
}

public class CustomException {

    public static void main(String[] args) {

        boolean breakTime = true;
        if (breakTime){
            throw new BreakTimeException("let have a break please");
        }else {
            System.out.println("Continue the class");
        }
        //throw new RuntimeException("Its break time, we should take break");
    }

}
