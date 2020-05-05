package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class dogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();


        dog1.setDogInfo("Husky", "Medium",3,"Black and White","Johnny");
        dog2.setDogInfo("German Shepherd","Small",1,"black & tan", "Boris");
        dog3.setDogInfo("pomeranian", "Small",4, "White", "Ernie");
        dog4.setDogInfo("pomeranian", "Small",3, "White", "Lil");
        dog5.setDogInfo("Poodle", "Medium", 4,"Brown","Oliver");




        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println("===========================================================");

        ArrayList<Dog> puppies = new ArrayList<>();
                 puppies.addAll(Arrays.asList(dog1,dog2,dog3));
                 puppies.addAll(Arrays.asList(dog4,dog5));

        for (int i = 0; i < puppies.size(); i++){

            Dog each = puppies.get(i);
            System.out.println(each);

        }

        System.out.println("========================================================");

        puppies.removeIf( p -> p.age > 2);

        for(int i = 0; i < puppies.size(); i++ ){
            Dog each  = puppies.get(i);
            System.out.println( each );
        }

    }

}

