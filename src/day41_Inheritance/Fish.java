package day41_Inheritance;

public class Fish extends Animal {

    public static void main(String[] args) {

        Fish fish1 = new Fish();
        fish1.name = "John";
        fish1.weigth = 6;
        System.out.println(fish1.name);
        System.out.println(fish1.weigth);

        fish1.eat();
    }
}
