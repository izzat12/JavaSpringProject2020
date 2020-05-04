package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {

        Predicate<Integer> OddNumber = x -> x % 2 !=0;

        ArrayList<Integer> list = new ArrayList<>();
               list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
               list.removeIf(OddNumber);

        System.out.println(list);

        System.out.println("========================");

//============================================================


     Predicate<Integer> lessThan5 = y -> y <= 5;

     ArrayList<Integer> numbers = new ArrayList<>();
             numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
             numbers.removeIf(lessThan5);
        System.out.println(numbers);

        System.out.println("=====================================");

        Predicate<String> startsWithM = s -> !s.toLowerCase().startsWith("m");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Izzat", "Bek", "Muhammad", "Mha", "Bilal"));

        names.removeIf(startsWithM);
        System.out.println(names);

        System.out.println("=======================");

//======================================================================

        Predicate<String> withA = each -> each.startsWith("M") || each.startsWith("A");

       ArrayList<String> namesList = new ArrayList<>();
       namesList.addAll(Arrays.asList("Muhtar", "Alex", "Asiya", "Dilnaz", "Radu"));

       namesList.removeIf(withA);

        System.out.println(namesList);

        System.out.println("===================================");

//======================================================================

        Predicate<Character> digits = c -> Character.isDigit(c);

       ArrayList<Character> digit = new ArrayList<>();
           digit.addAll(Arrays.asList('A', 'B', '3', '5', '%','Z'));

           digit.removeIf(digits);

        System.out.println(digit);

        System.out.println("========================================");

//=========================================================================


        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        number.removeIf(p -> p > 5);
        System.out.println(number);

    }
}
