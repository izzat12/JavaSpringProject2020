package day46_Final_Abstract;

public final class Circle extends Shape {
    public double radious;
    public final static double PI = 3.14;

    public Circle(double radious){

    }

    @Override
    void Area(){

        double area = radious * radious *PI;
        System.out.println("Area is: "+area);

    }
}
