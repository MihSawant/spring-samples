package main;

import config.ProjectConfig;
import entities.IceCream;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var iceCream = context.getBean(IceCream.class);

        System.out.println("Ice-Cream: "+iceCream.getFlavour()+" is " +
                "made of Chocolate: "+ iceCream.getChocolate().toString());
    }
}
