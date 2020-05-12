package day37_Constructor;

public class CybertekStudents {

    static String schoolName;
    String studentName; // we must need to know
    int groupNumber; // must need to know
    String batch;  // must need to know

    public CybertekStudents (String studentName, int groupNumber, String batch) {

        schoolName = "Cybertek University";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;

    }

    public String toString(){

        return "Student name: "+studentName+", Group number: "+groupNumber+", Batch: "+batch+", School name: "+schoolName;

    }
    }

    class CObject{

        public static void main(String[] args) {

            CybertekStudents student1 = new CybertekStudents("Izzat", 4, "Batch 18");
            System.out.println(student1);

        }

    }

