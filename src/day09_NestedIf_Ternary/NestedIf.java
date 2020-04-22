package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        int age = 17;
        boolean USCitizen = true;

        if(USCitizen){
           if(age > 17){
             System.out.println("You are eligible to vote");

           }else{
                System.out.println("Only the US Citizen are eligible to vote " +
                        "for Donal Trump");
            }
        }

        System.out.println("============================================");


     int score = 22;
     String grade = "";
     if(score>=0 && score<=100) {
         if (score >= 90) {
             grade = "A";
         } else if (score >= 80) {
             grade = "B";
         } else if (score >= 70) {
             grade = "C";
         } else if (score >= 60) {
             grade = "D";
         } else if (score > 50) {
             grade = "F";
         } else {
             grade = "Invalid";
         }
     }

        System.out.println(grade);
     ////////////////////////////////////////////////////////////////////
        // ternary

         int score2 = 76;
         String grade2 = "";

         if (score2>=0&& score2<=100){
             grade2 = (score2 >= 90) ? "A" : (score2 >= 80) ? "B" : "C";
         }else {
             grade2 = "Invalid";
         }

        System.out.println(grade2);
    }

}
