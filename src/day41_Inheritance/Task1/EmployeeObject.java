package day41_Inheritance.Task1;

public class EmployeeObject {
    public static void main(String[] args) {

       Developer dev1 = new Developer("Izzatulloh",2122,"Developer",120000,'M');

       System.out.println(dev1);
       dev1.fixingBug();
       dev1.coding();

        System.out.println("==========================================");

        Tester tester1 = new Tester("John",4454,"Tester",120000,'M');

        System.out.println(tester1);
        tester1.reportingBug();
        tester1.testing();

        System.out.println("=======================================");

        BusinessAnalyst analyst1 = new BusinessAnalyst("Usman",5644,"Business Analyst",130000,'M');

        System.out.println(analyst1);
       analyst1.writineReq();
       analyst1.gathering();



    }
}
