package service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    /*
        We are using the concept which is called as Weaving,
        where we have to first create a custom annotation
        and mark it @Target(Method) so that it can be only
        applied upon the methods, It's a good practice to follow
        to restrict the annotation usage, and make it available
        at runtime using RenentionPolicy.
        Next thing is we go to our Aspect class and instead of
        AspectJ syntax we specify the annotation as a pointcut,
        and then we go the method which we need to intercept and
        use annotation over that method.
        In my case i created the LogIt annotation to use over the
        downloading method of MovieService.
        It makes the things clear and also easy to read and understand
        what's going.
     */

    Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(LogIt)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] arguments = joinPoint.getArgs();
        logger.info("Args: "+ Arrays.asList(arguments));

        joinPoint.proceed();
    }
}
