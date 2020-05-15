package day07_IfStatements;

public class ifStatement {

    public static void main(String[] args) {

        if (9<10){
            System.out.println("True!!!!");
        }else{
            System.out.println("False");
        }

        int apples = 20;
        int banana = 30;

        if (apples > banana){
            System.out.println("I have more Apples than banana");
        }else{
            System.out.println("I have more bananas than apples");
        }


        String userName = "izzat";
        String password = "uzbek";
        if (userName == password){
            System.out.println("it is correct answer");
        }else {
            System.out.println("it is not worrect");
        }

    }
}
