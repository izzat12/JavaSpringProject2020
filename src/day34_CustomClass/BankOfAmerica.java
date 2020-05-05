package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    /*
    create a class called Bank Of America:
	bank of America is planning to create their automation team,
			                  there fore they are hiring three testers
	 create a list called AutomationTeam and store three Testers in it
	write a program that can remove the tester if he/she is manual tester
	write a program that can calculate the total budget of the Automation team
     */

    public static void main(String[] args) {

        Testers tester1 = new Testers();

        tester1.setTesterInfo("Izzatulloh", 129931,
                      "Automation Tester", 120000.00 );
//====================================================================

     Testers tester2 = new Testers();
     tester2.setTesterInfo("Madina",312342,"QA",
                                                  130000);
//======================================================================

        Testers tester3 = new Testers();
        tester3.setTesterInfo("Muhtar",423422,"Senior QA",
                180000);
//======================================================================

        Testers tester4 = new Testers();
        tester4.setTesterInfo("Osman",332546,"SDET",
                100000);
//======================================================================

        Testers tester5 = new Testers();
        tester5.setTesterInfo("Guli",234256,"Manual Tester",
                90000);
//======================================================================


        ArrayList<Testers> testers = new ArrayList<>();
                testers.addAll(Arrays.asList(tester1,tester2,
                        tester3,tester4,tester5));

        testers.removeIf(p-> !p.jobTitle.contains("SDET"));

        double totalBudget = 0 ;
        for (Testers each : testers){

            System.out.println(each);
            totalBudget +=each.salary;
        }
        System.out.println(totalBudget);


    }
}
