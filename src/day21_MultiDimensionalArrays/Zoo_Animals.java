package day21_MultiDimensionalArrays;

public class Zoo_Animals {
    public static void main(String[] args) {

        String[] wildAnimals = { "Tiger", "Lion", "Monkey", "Turtle", "Corcodile"};
        String[] birds = {"Eagle", "Peacock", "Ducks", "Chicken"};

        String[][] zoo = { wildAnimals, birds};

       String kfc =  zoo[1][3];
        System.out.println(kfc);

        System.out.println("========================");

        for (String eachEach: zoo[1] ){
            if (eachEach.equals("Chicken")){
                continue;
            }
            System.out.println(eachEach);
        }
        System.out.println("==============================");

        for (String eachAnimal : zoo[0]){
            System.out.println(eachAnimal);

        }




    }
}
