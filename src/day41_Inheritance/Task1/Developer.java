package day41_Inheritance.Task1;

public class Developer extends Employee{

    /*
    super class: Employee sub class: developer
    variables: salary, name, jobittle, gender
    action: fixingBug, coding
    create a constructor that can initialize the all the attiribute
     */

    public Developer(String name, long id, String jobTitle, double salary, char gender){
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;

    }


    public void fixingBug(){
        System.out.println(name+" is fixing the bugs");
    }

    public void coding(){
        System.out.println(name +" is coding the project");
    }

}
