package day41_Inheritance;

public class bookObjects {
    public static void main(String[] args) {


        Ebook book1 = new Ebook();
        book1.title = "Better Live";
        book1.author = "Johnny Jack";
        book1.price = 30;
        book1.size = "1.5MB";
        book1.pages = 432;

        System.out.println(book1);
        System.out.println("Size: "+book1.size);
        System.out.println("Book pages: "+book1.pages);

        book1.readbook();

        System.out.println("====================================");


        AudioBook audiobook1 = new AudioBook();
        audiobook1.title = "Cybertek";
        audiobook1.author = "Muhtar Master";
        audiobook1.price = 1000;
        audiobook1.lenth = " 6 hours and 30 minutes";


        System.out.println(audiobook1);
        System.out.println("Length of the AudioBook \""+audiobook1.title+"\" is"+audiobook1.lenth+".");

        audiobook1.listen();
    }
}