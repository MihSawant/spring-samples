package data;

import entities.Chocolate;

import java.util.Arrays;
import java.util.List;

public class ChocolateAggregator {

    public List<Chocolate> getAllChocolates(){
       Chocolate c1 = new Chocolate();
       c1.setCompanyName("Catbury");
       c1.setBrandName("Dairy Milk Silk");

       Chocolate c2 = new Chocolate();
       c2.setCompanyName("Catbury");
       c2.setBrandName("Bournville");

       Chocolate c3 = new Chocolate();
       c3.setCompanyName("Nestle");
       c3.setBrandName("Kit-Kat");

       Chocolate c4 = new Chocolate();
       c4.setCompanyName("Mars");
       c4.setBrandName("Snickers");

       Chocolate c5 = new Chocolate();
       c5.setCompanyName("Catbury");
       c5.setBrandName("Gems");

       return Arrays.asList(c1, c2, c3, c4, c5);
    }
}
