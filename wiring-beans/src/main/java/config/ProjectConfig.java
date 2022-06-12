package config;

import entities.Chocolate;
import entities.IceCream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Chocolate chocolate(){
        Chocolate c = new Chocolate();
        c.setCompanyName("Catbury");
        c.setBrandName("Dariy Milk");
        return c;
    }

    @Bean
    public IceCream iceCream(){
        IceCream ic = new IceCream();
        ic.setFlavour("Chocolate");
        ic.setChocolate(chocolate());
        return ic;
    }

}
