package day34_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Testers tester1 = new Testers();
        tester1.setTesterInfo("Madina",221,"QA",
                130000);

        Testers tester2 = new Testers();
        tester1.setTesterInfo("Izzat",212,"QA",
                120000);

        ScrumTeam scrum = new ScrumTeam();
        scrum.hireTester(tester1);
        scrum.hireTester(tester2);

        System.out.println(scrum.testersTeam.size());

        scrum.fireTester(212);
        System.out.println(scrum.testersTeam.size());
    }
}
