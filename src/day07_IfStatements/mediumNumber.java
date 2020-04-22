package day07_IfStatements;

/*
write a java program that accepts three numbers and return the medium number
				(assume that none of them are equal)
 */
public class mediumNumber {
    public static void main(String[] args) {

        double a = 200;
        double b = 400;
        double c = 500;

        boolean aMedi = ( a < b && a >c)|| (a > b && a< c);
        boolean bMedi = (b<c && b>a) || (b >c && b<a);
        boolean cmedi = ( c < b && c>a) || (c>b && c<a);

        if(aMedi){
            System.out.println(a+ " is medium number");
        }
        if(bMedi){
            System.out.println(b + " is medium number");
        }
        if(cmedi){
            System.out.println(c + " is medium number");
        }








    }
}
