package config;

import entities.IceCream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    public IceCream iceCream1(){
        IceCream iceCream = new IceCream();
        iceCream.setFlavour("Vanilla");
        iceCream.setAvailableInCone(true);
        return iceCream;
    }

    @Bean
    public IceCream iceCream2(){
        IceCream iceCream = new IceCream();
        iceCream.setFlavour("Strawberry");
        iceCream.setAvailableInCone(false);
        return iceCream;
    }
}
