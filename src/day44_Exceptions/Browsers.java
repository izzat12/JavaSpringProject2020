package day44_Exceptions;

public class Browsers {

    protected void openBrowser(){
        System.out.println("opening the default browser");
    }
    protected void closeBrowser(){
        System.out.println("Closing the default browse");
    }

}


class chromeBrowse extends Browsers{

    public void openBrowser(){
        System.out.println("Opening the chrome browser");
    }
    public void closeBrowser(){
        System.out.println("Closing the chrome browser");
    }
}


class FirefoxBrowse extends Browsers{

    public void openBrowser(){
        System.out.println("Opening the Firefox browser");
    }
    public void closeBrowser(){
        System.out.println("Closing the Firefox browser");
    }
}



class Test{

    public static void main(String[] args) {
        chromeBrowse obj = new chromeBrowse();
        obj.openBrowser();
        obj.closeBrowser();


        FirefoxBrowse object2 = new FirefoxBrowse();
        object2.openBrowser();
        object2.closeBrowser();
    }
}