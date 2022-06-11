package main;

import config.ProjectConfig;
import entities.Chocolate;
import entities.IceCream;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Chocolate chocolate = context.getBean(Chocolate.class);
        chocolate.setCompanyName("Nestle");
        chocolate.setBrandName("Five Star");

        IceCream iceCream = context.getBean(IceCream.class);
        iceCream.setFlavour("Vanilla");
        iceCream.setAvailableInCone(true);


        System.out.println("Chocolate: "+chocolate.getCompanyName()+" "+chocolate.getBrandName());
        System.out.println("Ice-Cream: "+iceCream.getFlavour()+" is Available in cone: "+iceCream.isAvailableInCone());
    }
}
