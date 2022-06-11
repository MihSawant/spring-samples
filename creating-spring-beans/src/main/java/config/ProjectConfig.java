package config;

import entities.Chocolate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Chocolate chocolate(){
        Chocolate chocolate = new Chocolate();
        chocolate.setCompanyName("Catbury");
        chocolate.setBrandName("Dairy Milk");
        return chocolate;
    }

    @Bean
    public String hello(){
        return "Hello";
    }


}
