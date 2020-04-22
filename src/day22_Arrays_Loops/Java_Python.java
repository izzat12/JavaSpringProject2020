package day22_Arrays_Loops;

public class Java_Python {
    public static void main(String[] args) {
/*
   Task:
     write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                   MUST use Arrays and for each loop.
 */

         String sentence = "I like java and javaScript python python";
         int countJava = 0;  // 2
        int countpython = 0;

        String[] words = sentence.split(" "); // [ I, like, java, and, javaScript ] 5

        for (String each : words){
            if (each.contains("java")){
                countJava++;
            }
            if (each.contains("python")){
                countpython++;
            }

        }
        System.out.println(countJava);
        System.out.println(countpython);
        System.out.println(countJava == countpython);























    }
}
