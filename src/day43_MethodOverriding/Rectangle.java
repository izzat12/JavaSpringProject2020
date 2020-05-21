package day43_MethodOverriding;

public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(double length, double width){

        this.length = length;
        this.width = width;
    }

    public void calculateArea(){
        area = length * width;
        System.out.println("Area of the Rectangle: "+area);
    }

@Override

    public void calculatePerimeter(){

        perimeter = (width + length)*2;
        System.out.println("Perimeter of the Rectangle: "+perimeter);
    }

}
