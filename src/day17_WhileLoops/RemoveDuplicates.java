package day17_WhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAAAAAAAAAAASDAAAAAAAASDADFSDFGDRGSDA";
        int count = 0;

        String word = "A";

        while (str.contains(word)){
                      count++;
                      str = str.replaceFirst(word,"");  // after counting first java we need to reomove it from the str
        }
        System.out.println(count);

    }
}
