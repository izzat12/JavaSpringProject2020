package day40_Enclpsulation;

public class BankOfAmerica {

    public static void main(String[] args) {

        EmployeeInfo izzat = new EmployeeInfo();

        izzat.setAddress("Manchester, Maryland");
        System.out.println(izzat.getAddress());

        izzat.setId(3323);
        System.out.println(izzat.getId());

        izzat.setSsn(23423234);
        System.out.println(izzat.getSsn());

        izzat.setSalary(12000);
        System.out.println("$"+izzat.getSalary());

        System.out.println(izzat.companyName);

    }
}
