package main;

import config.ProjectConfig;
import entities.Chocolate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*
            This will thorw an error because we have created and stored three
            instances of Chocolates they are chocolate1, chocolate2 and chocolate3
            So when I want the Chocolate instance from the context, Then Spring is
            confused which one i need reference, so here i will have to specify the bean
            with name of bean which is the method name that i created in ProjectConfig
            class

         */
       // var chocolate1 = context.getBean(Chocolate.class);

        /*
            The following example will run because now i have specified clearly that which
            instance do i need and now spring will get the bean from the context for me,
            which in my case is Kit-Kat Chocolate.
            When more than one bean exists of same type then we have to also specify the
            name of the bean which also can be done while creating bean with @Bean annotation
            just specify with name or value attribute.
         */
        var chocolate1 = context.getBean("chocolate1", Chocolate.class);

        /*
            Here i have used the bean name directly which i created from the Config class
            just name the bean with name attribute and Spring will create the bean with
            the specified name, so you can use it later to refer.
         */
        var chocolate2 = context.getBean("catbury", Chocolate.class);


        System.out.println("Chocolate: "+chocolate1.getCompanyName()+" "+chocolate1.getBrandName());
        System.out.println("Chocolate: "+chocolate2.getCompanyName()+" "+chocolate2.getBrandName());


    }
}
