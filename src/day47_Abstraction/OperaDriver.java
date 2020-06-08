package day47_Abstraction;

public class OperaDriver extends RemoteWebDriver {

    public void get(String URL){
        System.out.println("Opening "+URL+" in the Opera Browser");
    }

    public void quit(){
        System.out.println("Closing the Opera Browser");
    }

}
