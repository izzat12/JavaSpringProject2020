package day03_VariablesContinue;

public class SalaryCalculator {

    public static void main(String[] args) {

        double rate = 49;
        float stateTaxRate = 0.04F;
        float federalRate = 0.22f;
        byte weeklyHours = 40;

        // salary =  55 * 40 * 4 * 12 =

        double salary = rate * weeklyHours * 52;

        //stateTax = salary * stateTaxRate

        double stateTax = salary * stateTaxRate;

        //FederalTax = salary * federaltax

        double federalTax = salary * federalRate;

        //income after tax = salary - (statetax + federaltax)

        double incomeAfterTax = salary - (stateTax + federalTax);

        System.out.println("Your Salary is: " + salary);   // salary
        System.out.println("State tax is: " + stateTax);  // state tax
        System.out.println("Federal tax is: " + federalTax);  //federal tax
        System.out.println("Total tax is: " + ( stateTax + federalTax));  //total tax
        System.out.println("Your salary is: " + incomeAfterTax);   // home salary





    }




}
