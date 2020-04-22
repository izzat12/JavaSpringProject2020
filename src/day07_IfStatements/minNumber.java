package day07_IfStatements;
/*
 write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
 */
public class minNumber {
    public static void main(String[] args) {

        double a = 22.4;
        double b = 22.2;
        double c = 22;

        boolean aResult = a<b && a<b;
        boolean bResult = b<a && b<c;
        boolean cresult = c<b && c<a;

        if(aResult){
            System.out.println(a + " is minimum number");
        }
        if(bResult){
            System.out.println(b + " is minimum number");
        }

        if(cresult){
            System.out.println(c + " is minimum number");
        }







    }


}
