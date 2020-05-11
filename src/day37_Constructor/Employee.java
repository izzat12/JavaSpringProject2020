package day37_Constructor;

public class Employee {

    /*
    1. Create a class called Employee
			instance variables:
					name, ID, ssn, jobTitle, salary, gender

		actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string

     */

    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setEmployeeInfo(String name, long id, long ssn, String jobTitle, double salary, char gender){

        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;


    }

    public String toString(){

        String result = "Employee name is "+name+", EmployeeID: "+id+ ", Social Security Number: "+ssn+", Job title: "+jobTitle
                +", Salary: $"+salary+", Gender: "+gender;

        return  result;

    }




}
