package day43_MethodOverriding;

public class Shape{

     public double area;
     public double perimeter;


    protected void calculateArea(){
        area =0;
        System.out.println("Area of the shape: "+area);

    }



    public void calculatePerimeter(){

        perimeter = 0;
        System.out.println("Perimeter of the shape: "+perimeter);
    }

}
