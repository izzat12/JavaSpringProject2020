package day48_Abstraction;

public class Iphone extends Phone {
    static {
        brand = "Iphone";
    }

    public void faceTime(long phoneNumber){
        System.out.println("IPhone is facetiming with "+phoneNumber);
    }

    public Iphone(String model, double price, String size) {

        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("IPhone is calling with "+phoneNumber);

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("IPhone is texting with "+phoneNumber);

    }
}
