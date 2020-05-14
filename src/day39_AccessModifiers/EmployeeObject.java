package day39_AccessModifiers;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John");
        System.out.println(employee1);

        System.out.println("===========================");


        Employee employee2 = new Employee("John","SDET");
        System.out.println(employee2);

        System.out.println("=============================");

        Employee employee3 = new Employee("John","Senior QA",2123);
        System.out.println(employee3);

        System.out.println("===============================");

        Employee employee4 = new Employee("John","Senior SDET",3234,130000);
        System.out.println(employee4);

        System.out.println("===============================");

        Employee employee5 = new Employee("John","Senior SDET",3234,130000,'M');
        System.out.println(employee5);






    }
}
