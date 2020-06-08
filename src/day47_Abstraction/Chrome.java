package day47_Abstraction;

public class Chrome extends RemoteWebDriver{

    @Override
    public void get(String URL) {

        System.out.println("Opening" +URL+ "the Chrome");
    }

    @Override
    public void quit() {
        System.out.println("Closing the Chrome");
    }

}
