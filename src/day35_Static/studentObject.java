package day35_Static;

import day34_CustomClass.Student;

public class studentObject {
    public static void main(String[] args) {

        student student1 = new student();

               student1.setInfo("Izzat",3242,3.43);
        System.out.println(student1);

        student student2 = new student();

        student2.setInfo("Muhtar",3413,3.55);
        System.out.println(student2);


       student.printSchoolName();

    }
}
