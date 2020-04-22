package day21_MultiDimensionalArrays;

public class Longest_Shortest_Words {
    public static void main(String[] args) {

        /*
        2. write a program that can return the logest string of text from an array

	    3. write a program that can return the shortest string of text from an array
         */
        String[] names = {"Reem", "Izzat", "Muhtar", "Emrah", "Mohammad", "Izzatullohbek", "AAAAABBBCCCAAASD", "Ana"};

        int maxLength = names[0].length();
        int minLength = names[0].length();

        String longestword = "";
        String shortestword = "";

        for (int i = 1;  i <=names.length-1; i++){

            if (names[i].length() > maxLength){
                maxLength = names[i].length();
                longestword = names[i];
            }

            if (names[i].length() < minLength){

                minLength = names[i].length();
                shortestword = names[i];
            }
        }

        System.out.println(longestword);
        System.out.println(shortestword);


    }
}
