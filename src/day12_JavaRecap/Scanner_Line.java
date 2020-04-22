package day12_JavaRecap;
import java.util.Scanner;
public class Scanner_Line {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter some number: ");
        int num = scan.nextInt();
        System.out.println(num);

        scan.nextLine();                  //used for taking out the "Enter"

        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println(name);








    }
}
