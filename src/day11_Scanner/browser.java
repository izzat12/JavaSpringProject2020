package day11_Scanner;
/*
 write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome,
                        firefox, opera, safari.
                        3. if the browser name does not match with the
              valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
 */
public class browser {
    public static void main(String[] args) {

        String browserName = "Chrome";

        switch(browserName){
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;
            case "FireFox":
                System.out.println("FireFox is oepening...");
                break;
            case "Opera":
                System.out.println("Opera is opening");
                break;
            case "Safari":
                System.out.println("Sofari is opening");
                break;
            default:
                System.out.println("Invalid web browser...");
                break;
        }

        System.out.println(browserName);






    }
}
