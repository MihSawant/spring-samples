package config;

import entities.Chocolate;
import entities.IceCream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Chocolate chocolate(){
        Chocolate chocolate = new Chocolate();
        chocolate.setCompanyName("Mars");
        chocolate.setBrandName("Galaxy");
        return chocolate;
    }

    /*
        Here I directly passed the required bean as the method parameter
        so Spring will see it and from it's context it will try to find
        the Chocolate bean and then inject it.
        This approach is Wiring Beans using the method parameters.
     */
    @Bean
    public IceCream iceCream(Chocolate chocolate){
        IceCream iceCream = new IceCream();
        iceCream.setFlavour("Choco-Nuts");
        iceCream.setChocolate(chocolate);
        return iceCream;
    }
}
