package main;

import config.ProjectConfig;
import data.ChocolateAggregator;
import entities.Chocolate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        var ct = new AnnotationConfigApplicationContext(ProjectConfig.class);

        ChocolateAggregator ca = new ChocolateAggregator();

        /*
            Let's take a condition that we Only want to add the Catbury
            chocolates instances in the Context, then we need to use
            the registerBean() method which takes name of bean, class
            and supplier (Functional Interface that takes nothing but gives Something as a return)
            We use registerBean() method in situation where there some condition and
            we have to add beans.
         */
         ca.getAllChocolates()
                .stream()
                .filter(chocolate -> chocolate.getCompanyName().equals("Catbury"))
                .forEach(chocolate -> {
                    ct.registerBean(chocolate.getBrandName(), Chocolate.class, () -> chocolate);
                });

         var c1 = ct.getBean("Gems", Chocolate.class);
         var c2 = ct.getBean("Dairy Milk Silk", Chocolate.class);
         var c3 = ct.getBean("Bournville", Chocolate.class);
        System.out.println(c1.getBrandName());
        System.out.println(c2.getBrandName());
        System.out.println(c3.getBrandName());


    }
}
