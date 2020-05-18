package day41_Inheritance.Task1;

public class Employee {

    /*
    class named "Employee"
    variables: salary, name, jobittle, gender
    action: toString
     */

    public String name;
    public double salary;
    public long id;
    public String jobTitle;
    public char gender;

    public String toString(){

        return "Name: "+name+", ID: "+id+", Job Title: "+jobTitle+", Salary: $"+salary+", Gender: "+gender;
    }

}
