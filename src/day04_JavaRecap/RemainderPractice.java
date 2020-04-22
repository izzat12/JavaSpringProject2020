package day04_JavaRecap;

public class RemainderPractice {
    public static void main(String[] args) {

        // 1897651 is odd
        int number = 87654;

        boolean oddNum = number % 2 !=0;
        boolean evenNum = number % 2 ==0;

        boolean divisibleBy3 = number % 3 ==0;
        boolean divisibleBy5 = number % 5 ==0;


        System.out.println("The number " +number+ " is odd number: " + oddNum);
        System.out.println("The number " +number+ " is even number: " + evenNum);
        System.out.println("The number " +number+ " is divisble by 3: " + divisibleBy3);
        System.out.println("The number " +number+ " is divisble by 5: " + divisibleBy5);


    }


}
