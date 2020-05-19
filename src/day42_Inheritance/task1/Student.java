package day42_Inheritance.task1;

/*
create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
 */
public class Student extends Person {

    public long studentID;
    public String clazz;
    public static String schoolName = "Cybertek University";

    public void setStudentID(String name, int age, char gender, long studentID, String clazz){

        setPersonInfo(name, age, gender);
        this.studentID = studentID;
        this.clazz = clazz;

    }

    public void attenClass(){

        System.out.println(name+" is attending "+clazz);
    }

    public void code(){
        System.out.println(name+" is coding");
    }

    public String toString(){

        return "Student full name: "+name+", Student ID: "+studentID+", Class name: "+clazz+
                ", Age: "+age+", Gender: "+gender+", School name: "+schoolName;

    }

}
