package day47_Abstraction;

public  class FirefoxDriver  extends RemoteWebDriver{


    @Override
    public void get(String URL) {

        System.out.println("Opening " +URL+ " the Firefox");

    }

    @Override
    public void quit() {

        System.out.println("Closing the Firefox browser");

    }
}
