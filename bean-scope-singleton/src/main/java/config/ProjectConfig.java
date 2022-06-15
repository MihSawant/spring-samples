package config;

import entities.IceCream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public IceCream iceCream(){
        IceCream iceCream = new IceCream();
        iceCream.setFlavour("American-Nuts");
        iceCream.setAvailableInCone(true);
        return iceCream;
    }

}
