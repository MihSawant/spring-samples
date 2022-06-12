package config;

import entities.Chocolate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Chocolate chocolate1(){
        Chocolate c1 = new Chocolate();
        c1.setCompanyName("Nestle");
        c1.setBrandName("Kit-Kat");
        return c1;
    }

    @Bean(name = "catbury")
    public Chocolate chocolate2(){
        Chocolate c2 = new Chocolate();
        c2.setCompanyName("Catbury");
        c2.setBrandName("Perk");
        return c2;
    }
    @Bean
    public Chocolate chocolate3(){
        Chocolate c3 = new Chocolate();
        c3.setCompanyName("Mars");
        c3.setBrandName("Snickers");
        return c3;
    }

}
