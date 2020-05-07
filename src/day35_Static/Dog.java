package day35_Static;

public class Dog {

    static String breed;
    static boolean isPet;
  static  int age;

    public static void main(String[] args) {

        Dog dog1 = new Dog();
         dog1.breed = "Husky";
         dog1.isPet = true;

         Dog dog2 = new Dog();
         dog2.breed = "German Shepherd";

        System.out.println(dog1.breed);
        System.out.println(dog2.breed);
        System.out.println(dog1.isPet);
        System.out.println(dog2.isPet);
    }

}
