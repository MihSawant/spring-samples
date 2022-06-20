package services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Aspect
@Component
public class LoggingAspect {

    /*
        Aspect is some logic that you want to execute when the framework calls
        the method of your choice.
        Basically when you want to intercept between the methods and change
        the behaviour of the methods, and remove the repetitive part of your
        code, You can use Aspect

        To use the Aspect functionality in our project, We need to add
        first the dependency spring-aspects and then to use it follow
        these steps:
        1. Mark the Configuration with @EnableAspectJAutoProxy
        2. Create a class and mark it with @Aspect annotation
           and remember that @Aspect is not a stereotype annotation so
           mark it with stereotype annotation like Component, Service and add to the
           context. Because Spring will manage it, and to do so it needs to
           manage and have the dependency and bean within its context.
        3. Advice which is the @Around annotation and then use
           the AspectJ programming language to tell spring that when
           to intercept the method. i.e. Before or After or directly execute
        4. Then we add Point-Cut which would specify which target method to execute
           and intercept. And it should follow the specific syntax
           otherwise it will throw Exception, execution means during execution of
           the MovieService's class streamMovie method.
        5. The method parameter has ProceedingJoinPoint is the target method to
           execute, joinPoint.proceed() calls the method and before and after
           that i have defined some logic that i want to execute.

           If I do not mention the joinPoint.proceed() i.e. the target then it will
           not call the streamMovie method and skip it and only print the log statements.

            Aspect does not directly give us access to the object rather it gives a proxy
            to that object that we can use to intercept the methods.

            Aspects are very powerful feature of Spring which is called as Aspect Oriented Programming

     */


    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Get Ready for the Movie");
        logger.info("Get Pop-Corn and Cold-Drink...");
        joinPoint.proceed();
        Thread.sleep(3500);
        logger.info("Movie Ended");
        logger.info("Thank You for Watching :)");
    }
}
