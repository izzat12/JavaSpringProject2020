package day35_Static;

public class Offer {

    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setOfferInfo (String location, String company, double salary, boolean isFullTime){

        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;

    }


    public String toString(){

        String result = "Company name is "+company+ ", location is at "+location+ ", salary is $"+salary+
                                     ", is job full time: "+isFullTime;
        return result;


    }


}
