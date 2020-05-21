package day42_Inheritance;

class A {

    int a = 100;

    public A(double b){
        System.out.println(this.a);
    }
}


public class SuperKeyword extends A {
    int a = 200;

    public SuperKeyword(){
        super(3.0);
        System.out.println(super.a);
    }

    public static void main(String[] args) {

        //SuperKeyword obj1 = new SuperKeyword();

        A object2 = new A(5.5);
    }
}
