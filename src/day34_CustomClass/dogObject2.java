package day34_CustomClass;

public class dogObject2 {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky", "Medium",3,"Black and White","Johnny");

        Dog dog2 = new Dog();
        dog2.setDogInfo("German Shepherd","Small",1,"black & tan", "Boris");

        Dog dog4 = new Dog();
        dog4.setDogInfo("pomeranian", "Small",3, "White", "Lil");

        Dog dog5 = new Dog();
        dog5.setDogInfo("Poodle", "Medium", 4,"Brown","Oliver");


        //eating
        dog1.eating(" chicken");
        dog2.eating(" beef");
        dog4.eating(" fish");

        System.out.println("==============================");

        dog1.drinking(" pepsi");
        dog2.drinking(" water");
        dog5.drinking(" milk");

        System.out.println("===============================");

        dog1.playing("papers");
        dog2.playing("cat toys");
        dog4.playing("ball");

        System.out.println("=====================================");


        Dog[] dogpark = {dog1,dog2,dog4,dog5};

        for (int i =0; i < dogpark.length; i ++){
            dogpark[i].eating("chicken");
        }

        System.out.println("=======================================");

        for (Dog each : dogpark){
            each.drinking("water");
        }

        System.out.println("========================================");

        for (int i = 0; i < dogpark.length; i ++){
            dogpark[i].playing("ball");

        }

    }
}
