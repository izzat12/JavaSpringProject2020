package day06_Shorthand_LogicalOperators;

public class SingleIfState {
    public static void main(String[] args) {

        boolean coldWeather = false;
        if (coldWeather) {
            System.out.println("Wear your hat");
            System.out.println("wear your jacket");
            System.out.println("don't go outside");

        }
 /////////////////////////////////////////////////////////////////////

        boolean coronaDetected = true;
        if(coronaDetected){

            System.out.println("Buy More toilet papers");
        }
        System.out.println("=============================================================");
///////////////////////////////////////////////////////////////////////////////////

        int a = 101;
        boolean evenNum = a % 2 == 0;
        boolean oddNum = a % 2 !=0;
        if(evenNum){

            System.out.println(a + " is even number");
        }
        if (oddNum){

            System.out.println(a+ " is odd number");
        }
///////////////////////////////////////////////////////////////////////
























    }

}
