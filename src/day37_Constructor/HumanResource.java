package day37_Constructor;

public class HumanResource {
    /*
    2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees

     */

    static Employee employe1 = new Employee();
    static Employee employe2 = new Employee();
    static Employee employe3 = new Employee();
    static Employee employe4 = new Employee();
    static Employee employe5 = new Employee();

    public static void main(String[] args) {

        employe1.setEmployeeInfo("Izzat Bek",2211,332323232,"SDET",120000,'M');
        employe2.setEmployeeInfo("Osman",3323,434342333,"Senior SDET",130000,'M');
        employe3.setEmployeeInfo("John",5634,654877655,"QA",140000,'M');
        employe4.setEmployeeInfo("Madina",7869,877562343,"SDET",110000,'F');
        employe5.setEmployeeInfo("Malika",5644,655657565,"Junior SDET",150000,'F');

        System.out.println(employe1);
        System.out.println(employe2);
        System.out.println(employe3);
        System.out.println(employe4);
        System.out.println(employe5);


    }

static {

    employe1.setEmployeeInfo("Izzat Bek",2211,332323232,"SDET",120000,'M');
    employe2.setEmployeeInfo("Osman",3323,434342333,"Senior SDET",130000,'M');
    employe3.setEmployeeInfo("John",5634,654877655,"QA",140000,'M');
    employe4.setEmployeeInfo("Madina",7869,877562343,"SDET",110000,'F');
    employe5.setEmployeeInfo("Malika",5644,655657565,"Junior SDET",150000,'F');


}



}
