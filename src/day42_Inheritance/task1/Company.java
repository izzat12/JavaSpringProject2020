package day42_Inheritance.task1;


import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called company:
		create 3 objects of employee and set thier info
		create an array of employees and store all those employee objects
		use regular for loop to print out each employee' name and employeeID

 */
public class Company {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();


        employee1.setEmployeeInfo("Bek",23,'M',120000,3434,"SDET");
        employee2.setEmployeeInfo("John",25,'M',140000,3453,"Developer");
        employee3.setEmployeeInfo("Madina",32,'F',130000,3463,"Tester");


        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1,employee2,employee3));

        for (Employee each : employeeList){

            System.out.println(each);
        }


    }

}
