package day09_NestedIf_Ternary;
public class eachGroup {
    public static void main(String[] args) {

        /*
        age groups are:
        teeneger
        adult
        senior

        age cannot be negative or greater 150
         */

        int age = 20;
        String ageGroup = "";

        if (age<150 && age>0) {
            if (age < 21) {
                ageGroup = "Teenager";
            } else if (age < 55) {
                ageGroup = "Adult";
            } else if (age >+ 55) {
                ageGroup = "Senior Citizen";
            } else {
                ageGroup = "Invalid";
            }
        }
        System.out.println(ageGroup);






    }

}
