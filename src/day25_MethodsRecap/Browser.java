package day25_MethodsRecap;

public class Browser {

    public static void main(String[] args) {

   String str = getDriver1("ChroMe");
        System.out.println(str);

        String str2 = getDriver2("fireFox");
        System.out.println(str2);

        String str3 = getDriver3("opera");
        System.out.println(str3);

    }


   // Switch Statement ; if you want to assign another web driver, it is easy in switch statement
    public static String getDriver1(String browserName){

        String result = "";

        switch (browserName.toLowerCase()){     // if the user pass ChromE. lowerCase() --> chrome

            case "chrome":
                result = "Chrome Driver";
                break;
            case "fireFox":
                result = "FireFox Driver";
                break;
            case "opera":
                result = "Opera Driver";
                break;
            case "internet explorer":
                result = "Internet Explorer Driver";
                break;
            case "safari":
                result = "Safari Driver";
                break;
            case "edge":
                result = "Edge Driver";
                break;
            default:
                result = "Invalid Driver";

        }

        return result;
    }


  //
    public static String getDriver2(String broswerName){

        broswerName = broswerName.toLowerCase();    // to ignore case sensitivity
        String result = "";

        if (broswerName.equals("chrome")){
            result = "Chrome Driver";
        } else if (broswerName.equals("firefox")){
            result = "FireFox Driver";
        }else if (broswerName.equals("opera")){
            result = "Opera Driver";
        }else if (broswerName.equals("safari")){
            result = "Safari Driver";
        }else if (broswerName.equals("edge")){
            result = "Edge Driver";
        }else{
            result = "Invalid Driver";
        }
        return result;
    }


    // Ternary
    public static String getDriver3(String browserName){

        browserName = browserName.toLowerCase();

        String result = (browserName.equals("chrome"))? "Chrome Driver" :
                        (browserName.equals("firefox"))? "FireFox Driver" :
                        (browserName.equals("opera"))? "Opera Driver" :
                        (browserName.equals("Safari"))? "Safari Driver" :
                        (browserName.equals("edge"))? "Edge Driver" : "Invalid Driver";

        return result;
    }



}
