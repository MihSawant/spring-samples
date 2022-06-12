package main;

import config.AppConfig;
import entities.IceCream;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(AppConfig.class);

        /*
            Here we can clearly see that when i am trying to refer
            IceCream class instance then context returns vanilla
            because i have marked the vanilla ice-cream bean with
            @Primary annotation which makes the bean default and
            in case of multiple beans of same type spring knows
            which one to use. So wherever i try to get reference
            of the IceCream bean then it will always return me the
            iceCream1() instance.
         */
        IceCream ic = c.getBean(IceCream.class);
        System.out.println("Ice-Cream: "+ic.getFlavour());

        IceCream ic2 = c.getBean(IceCream.class);
        System.out.println("Ice-Cream: "+ic2.getFlavour());

    }
}
