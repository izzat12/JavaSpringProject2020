package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObject {

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};

               carpets[0].CustomerOreder(7,8.5,20,true);

               carpets[1].CustomerOreder(10,15,30,false);

               carpets[2].CustomerOreder(9,21,16,true);

               carpets[3].CustomerOreder(8,16,15,false);

               carpets[4].CustomerOreder(10,20,20,true);

/*
        System.out.println(carpets[0]);
        System.out.println("=====================================");
        System.out.println(carpets[1]);
        System.out.println("=====================================");
        System.out.println(carpets[2]);
        System.out.println("=====================================");
        System.out.println(carpets[3]);
        System.out.println("=====================================");
        System.out.println(carpets[4]);
 */

//===============================================================================


        ArrayList<Carpet> persianCarpets = new ArrayList<>();

        for (Carpet each : carpets){
            if (each.isPersian){
                persianCarpets.add(each);
            }
        }

        System.out.println("There are "+persianCarpets.size()+ " persian carpets");

        for (int i =0; i < persianCarpets.size(); i++) {

            System.out.println(persianCarpets.get(i).calCost());
        }

        System.out.println("=========================");


    ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));

       // regularCarpets.removeAll(persianCarpets);
           regularCarpets.removeIf(p -> p.isPersian);

        System.out.println("There are "+regularCarpets.size() + " regular carpets");

        for (int i = 0; i < regularCarpets.size(); i ++) {


            System.out.println(regularCarpets.get(i).calCost());

        }

    }
}
