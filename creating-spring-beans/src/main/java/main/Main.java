package main;

import config.ProjectConfig;
import entities.Chocolate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var chocolate = context.getBean(Chocolate.class);
        String s = context.getBean(String.class);

        System.out.println("Chocolate: "+chocolate.getCompanyName()+" "+chocolate.getBrandName());
        System.out.println("Message -> "+s+" World!");
    }
}
