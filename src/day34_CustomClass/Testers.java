package day34_CustomClass;


public class Testers {

    /*
    create a class called Testers

			Attributes:
				name, employeeID, JobTitle, Salary

			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
     */

    String name;
    long employeeID;
    String jobTitle;
    double salary;


    public void setTesterInfo(String name, long employeeID, String jobTitle,double salary){

        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

public String toString(){

        String result = "Employee name: "+name+", Job Title: "+jobTitle+", Employee ID: "+
                         employeeID+", salary $"+salary;
        return result;

}

}
