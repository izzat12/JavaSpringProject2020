package day40_Enclpsulation;


public class credentialsObject {

    public static void main(String[] args) {
        credentials facebook = new credentials();

        facebook.setUserName("izzat@gmail.com");
        facebook.setPassWord("12345679");

        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassWord());

    }
}
