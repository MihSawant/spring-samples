package service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    /*
        Now we are seeing the real power of aspects i.e. we can also
        change the arguments if we want,
        change the return type if we want
        And the point is that the Main class which calls our target method
        getAvg() is unaware that there is some Proxy which is controlling
        the execution of getAvg() method, it will only think that the value
        of getAvg() is directly returned from Service but in reality there
        is an Aspect in between, which acts as a proxy and manipulating
        the return type.

        In this case, I called the target method and stored the value
        it returned into value variable, but while returning I returned
        primitive value or random int 9.7, When we execute the main method
        then 9.7 value will be final output. As the LoggingAspect has changed
        the returned type.
     */

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();

        logger.info("Method Name: "+methodName);

        Object[] newArgs = {new int[]{2, 4}};

        // AverageCalcService getAvg() method called
        var value =  joinPoint.proceed();

        logger.info("Method Returned: "+value);
        return 9.7;
    }

}
