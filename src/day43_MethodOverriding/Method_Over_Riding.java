package day43_MethodOverriding;


class Test{

    protected void method(){
        System.out.println("Over");
    }
}


public class Method_Over_Riding extends Test {
    @Override
    public void method(){
        System.out.println("zarina");
    }

    public static void main(String[] args) {

        Test obj1 = new Test();
        obj1.method();

        Method_Over_Riding object2 = new Method_Over_Riding();
        object2.method();

    }



}
