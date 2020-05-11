package day37_Constructor;

public class Student {

    String name;
    int age;
    char gender;
    String unversity;


    public Student(String name, int age, char gender, String unversity){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.unversity = unversity;

    }


    public void setInfo(String name, int age, char gender, String unversity){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.unversity = unversity;

    }

    public String toString(){

        String result = "Student name is "+name+", Age: "+age+", Gender: "+gender+", Name of University: "+unversity;
        return result;

    }


}
