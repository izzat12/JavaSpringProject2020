package day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {

        String result = "";
        if(9>10){
            result = "9 is greater";
        }else {
            result = "10 is greater";
        }

        String result2 = (9>10) ? "9 is greater" : "10 is greater";
        System.out.println(result);
        System.out.println(result2);
        System.out.println("=========================================");


int age = 26;
boolean eligility = (age>=21) ? true : false;
        System.out.println(eligility);
 /////////////////////////////////////////////////////////////////////
        System.out.println("--------------------------------------------------");


    int ageOfPerson = 20;

    String eligble = "";
    if(ageOfPerson>=18){
        eligble = "Yes";
    }else {
        eligble = "No";
    }

    String eligible = (ageOfPerson>=18) ? "Yes" : "No";
        System.out.println(eligble);
        System.out.println(eligible);













    }
}
