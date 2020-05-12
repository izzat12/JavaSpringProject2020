package day38_Constructors;

public class Dog {

    String name;
    String breed;
    String color;
    int age;


    public Dog(){

        name = "Unknown";
        breed = "Unknown";
        int age = 0;

    }

    public Dog(String breed){
        this.breed = breed;
        name = "Unknown";
        age = 0;
    }

    public Dog(String breed, int age){
        this.breed = breed;
        this.age = age;

    }

public String toString(){

        return "Name: "+name+", Breed: "+breed+", Age: "+age;

}


}
