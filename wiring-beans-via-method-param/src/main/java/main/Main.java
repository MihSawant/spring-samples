package main;

import config.AppConfig;
import entities.IceCream;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(AppConfig.class);

        var iceCream = c.getBean(IceCream.class);
        System.out.println("Ice-Cream: "+iceCream.getFlavour()+" " +
                "is made of Chocolate: "+iceCream.getChocolate());
    }
}
