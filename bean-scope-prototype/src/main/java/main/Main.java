package main;


import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.BillingListService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*
            When I access the bean then it gives me new instances of
            the Bean, in this case it will create two objects which
            are two separate instances so when we compare them the
            two objects are different, and it returns false.
         */
        var service1 = c.getBean("billingListService", BillingListService.class);

        var service2 = c.getBean("billingListService", BillingListService.class);

        System.out.println(service1 == service2);
    }
}
