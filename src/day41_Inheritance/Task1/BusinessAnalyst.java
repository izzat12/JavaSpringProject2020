package day41_Inheritance.Task1;

public class BusinessAnalyst extends Employee{

    //construtor
    public BusinessAnalyst(String name, long id, String jobTitle, double salary, char gender){
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;

    }


    public void writineReq(){
        System.out.println(name+" is writing the requirements");
    }

    public void gathering(){
        System.out.println(name+" is gathering requirement information");
    }

}
