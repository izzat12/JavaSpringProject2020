package day42_Inheritance.task1;


import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called school:
		create 3 objects of student and set thier info
		create a an ArrayList of students to store all student objects
		use for each loop to print out each students' name and studentID

 */
public class School {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();


        student1.setStudentID("Izzatulloh Patidinov",25,'M',3222,"Java");
        student2.setStudentID("Usman Bek",26,'M',5444,"Java");
        student3.setStudentID("Madina Jarouva",23,'F',5675,"Soft Skills");

        ArrayList<Student> studentlist = new ArrayList<>();
        studentlist.addAll(Arrays.asList(student1,student2,student3));

        for (Student each : studentlist){

            System.out.println(each);
        }




    }

}
