package day35_Static;

public class student {

    /*
    task 1:
                 create a custom class called student
                 attribute:
                           name, ID, GPA, classes
                 actions():
                 setInfo(); name, ID, GPA
                printSchoolName = "Cybertek"

                 to print use toString()
     */

    String name;
    int iD;
    double gpa;
    static String school = "Cybertek";


    public  void setInfo(String name, int iD, double gpa){  // if we use any isntance methods, then method should not be static

        this.name = name;
        this.iD =iD;
        this.gpa = gpa;

    }

    public static void printSchoolName(){

        System.out.println("School name is "+school);
    }

    public String toString(){

        return "Name: "+name+". School name: "+school;

    }





}
