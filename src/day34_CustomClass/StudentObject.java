package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student();
             student1.setStudentInfo("Adam","United States",
                     31, 3.2,'M',true);
        System.out.println(student1);

//=======================================================

        Student student2 = new Student();
        student2.setStudentInfo("Osman","Turkey",
                23, 3.5,'M',false);
        System.out.println(student2);

//=========================================================

      Student student3 = new Student();
       student3.setStudentInfo("Guli","Uzbekistan",
               22, 3.0,'M',true);
        System.out.println(student3);

//==========================================================

        Student student4 = new Student();
        student4.setStudentInfo("Madina","Uygur",
                21, 3.6,'M',false);
        System.out.println(student4);

        System.out.println("==================================================");
//==========================================================

        Student[] students = {student1,student2,student3,student4};

        ArrayList<Student> eligibleGraduate = new ArrayList<>(Arrays.asList(students));

             eligibleGraduate.removeIf(p ->p.gpa <=3.0);

        //System.out.println(eligibleGraduate.size());


        for (int i = 0; i <eligibleGraduate.size(); i++){

            Student each = eligibleGraduate.get(i);
            System.out.println(each.name+ " can graduate");

        }

        System.out.println("====================================================");

        ArrayList<Student> notEligible = new ArrayList<>(Arrays.asList(students));

          notEligible.removeIf(p ->p.gpa >3.0);
        System.out.println(notEligible.size());

        for (Student each : notEligible){
            System.out.println(each.name+" can not graduate");
        }


    }
}
