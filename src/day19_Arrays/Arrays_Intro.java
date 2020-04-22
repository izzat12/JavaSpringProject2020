package day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {

        //       Arrays examples...

      //  int scores = 90, 93, 70;   // it can hold one data..
/*
 Array can hold multi data in same time
        decleration:
        DataType[] variableName = {data1, data2, data3, data4};

              // 70, 75, 85, 90, 95, 100
*/

       int [] scores = { 70, 75, 85, 90, 95, 100};
// index number          0   1   2   3   4    5

       int number1 = scores[2];
        System.out.println(number1);

        int number2 = scores[5];
        System.out.println("Mike scores is "+ number2 +"%");


    }
}
