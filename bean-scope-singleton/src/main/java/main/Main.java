package main;

import config.ProjectConfig;
import entities.IceCream;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*
          There are basically two Scopes or approaches how Spring
          creates and manages the beans into it's context
           1. Singleton (default) Scope: Singleton means one instance,
           but don't confuse it with Singleton design pattern, In Singleton
           we only can create one instance per app, and later use it. But
           in Spring we can create multiple instances of same type as Singleton
           In the example below we can clearly see that when I call the iceCream
           bean then it returns the same instance. And both objects refer to same
           object Instance.
           Also, Singleton is default approach used in Spring Framework i.e. When
           we create beans either using @Bean or Stereotype annotations like @Component
           Spring will create and add objects instances using Singleton pattern / approach only.
           2. Prototype Scope
         */

        IceCream iceCream = context.getBean("iceCream", IceCream.class);
        IceCream iceCream2 = context.getBean("iceCream", IceCream.class);

        System.out.println(iceCream == iceCream2);
    }
}
