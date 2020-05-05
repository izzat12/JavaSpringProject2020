package day34_CustomClass;

public class Student {

    String name;
    String nationality;
    int age;
    double gpa;
    char gender;
    boolean isMarried;

    public void setStudentInfo(String name,String nationality, int age, double gpa, char gender, boolean isMarried){

        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.gpa = gpa;
        this.gender = gender;
        this.isMarried = isMarried;

    }


    public String toString(){

        String result = "Student name: "+name+ ", Gender: "+gender+ ", Nationality: "+nationality+
                         ", Age: "+age+", Married status: "+isMarried+ ", GPA: "+gpa;
        return result;
    }



}
