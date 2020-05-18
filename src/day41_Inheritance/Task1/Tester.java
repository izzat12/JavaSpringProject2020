package day41_Inheritance.Task1;

public class Tester extends Employee {

    /*
  sub class of Employee name it Tester:

    variables: salary, name, id, jobTitle, gender
    action: reportingBug, testing

 create a constructor that can initialize that all the attributes of Tester
     */

    public Tester(String name, long id, String jobTitle, double salary, char gender){
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;

    }


    public void reportingBug(){

        System.out.println(name+" is reporting");
    }

    public void testing(){
        System.out.println(name+" is testing");
    }

}
