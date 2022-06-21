package services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Order(2)
@Component
public class LoggingAspect {
    private static final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* services.AreaCalcService.calcArea(..))")
    public Object logResult(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("Logging Aspect: Calling Proxy");

        Object res = joinPoint.proceed();

        logger.info("Logging Aspect: method executed and returned: "+res);

        return res;
    }


}
