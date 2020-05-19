package day42_Inheritance.task1;

/*
create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString
 */
public class Employee extends Person {

    public double salary;
    public long id;
    public String jobTitle;
    public static String companyName = "Bank of America";

    public void setEmployeeInfo(String name, int age, char gender, double salary, long id, String jobTitle){

        setPersonInfo(name, age, gender);
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(name+" is working");
    }

    public String toString(){
        return "Full name: "+name+", Job Title: "+jobTitle+", Employee ID: "+id+", Salary: "
                +salary+", Age: "+age+", Gender: "+gender+", Company name: "+companyName;

    }

}
