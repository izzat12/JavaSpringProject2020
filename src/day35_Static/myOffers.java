package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("Maryland", "Bank of America",120000,true);


        Offer offer2 = new Offer();
        offer2.setOfferInfo("Rockville, Maryland", "Capital One",130000,false);


        Offer offer3 = new Offer();
        offer3.setOfferInfo("Tyson Corner, Virginia", "Technology One",110000,true);


        Offer offer4 = new Offer();
        offer4.setOfferInfo("Dallas, Texas", "Amazon",130000,false);


        Offer offer5 = new Offer();
        offer5.setOfferInfo("Chicago, Illinios", "Netflix",140000,true);


        Offer[] offers1 = {offer1,offer2,offer3,offer4,offer5};


        ArrayList<Offer> offers = new ArrayList<>();
               offers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5));


        for (int i = 0; i < offers.size(); i++){

            Offer each = offers.get(i);
            System.out.println(each);

        }
        System.out.println("=======================================================");


        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers1));
        Accept.removeIf(each -> each.salary < 100000);
        Accept.removeIf(each -> each.isFullTime == true);
        Accept.removeIf(each -> each.location.equals("Maryland") );

        System.out.println(Accept.size());



        for (Offer eachOffer : Accept){
            System.out.println(eachOffer);
        }








    }
}
