package day25_MethodsRecap;

public class return_Methods {

    public static void main(String[] args) {

        System.out.println(max(10, 32) );

        System.out.println(max2(200,54));


    }



    public static int max(int a, int b){

        int max = 0;
        if (a>=b)
        {
            max =a;
        }else{
            max = b;
        }
        return max;
    }

    public static int max2(int a, int b){

        if (a>=b){ // if a is greater or equal to b
            return a; // return the a value
        }else {       // otherwise
            return b; // return the b value
        }
    }

}
