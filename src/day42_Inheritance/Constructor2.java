package day42_Inheritance;

class Testing{
    public Testing(int a ){
        System.out.println("A");
    }

    public Testing(double a){
        System.out.println("C");
    }
}


public class Constructor2 extends Testing{

    public Constructor2(){
        super(15.5);
        System.out.println("B");
    }


    public static void main(String[] args) {

       // Testing object = new Testing(10);

        Constructor2 object2 = new Constructor2();
    }
}
