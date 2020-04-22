package day06_Shorthand_LogicalOperators;

public class warmUp {

    public static void main(String[] args) {

        double gallon = 1;
        double gallonsToLiters = gallon * 3.785;
        String result = gallon + " Gallons is equal to: " +gallonsToLiters + " liters";

        System.out.println(result);
        System.out.println("=====================================================");

        // write a java program that converts litters to gallons

        double Liters = 1;
        double littersToGallons = Liters / 3.785;
        String result1 = Liters+ " Liters is equal to "+littersToGallons+ " gallons";
        System.out.println(result1);

        System.out.println("======================================================");

        //write a java program that manually calaculate the code fragements;

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        // b = -200 + -200 * 200  % 2
        // b = -200 + -40000 % 2
        // b = - 200 + 0
        // b = -200
        System.out.println(b);
        System.out.println(a);

        System.out.println("========================================================");

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        // z = 300 + 400 - 300 * 400 +300 / 400
        // z = 300 + 400 - 12000 + 300 / 400
        // z = 300 + 400 - 12000 + 0
        // z = 700 - 12000 + 0

        System.out.println(z);


        /*
        warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;

         */



    }


}
