package day25_MethodsRecap;

public class Frequency {
    public static void main(String[] args) {
/*
write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
		Ex:
			Frequency("AAABB", "A");  ==> 3
			Frequency("ABAB", "B"); ==> 2
 */
        String str1 = "javajavajavajavajava";
        String str2 = "java";

        int count = 0;

        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make sure that we are not counting the same index over again

        }

        System.out.println(str1);
        System.out.println(count);


        String a = "python python python python";
        String b = "python";

        int number1 = Frequency(a, b);
        System.out.println(number1);

    }


    public static int Frequency(String str1, String str2) {

        int count = 0;

        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make sure that we are not counting the same index over again

        }
        return count;
    }


}

