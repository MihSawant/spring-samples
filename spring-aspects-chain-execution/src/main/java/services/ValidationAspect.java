package services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Order(1)
@Component
public class ValidationAspect {
    /*
        We are trying to execute the Aspect Chain of execution
        where there are two aspects and they both are intercepting same
        method AreaCalcService.
        In this case I have marked the Aspects with Order, because
        if we do not mention it then Spring will execute the aspects in
        any order which we cannot determine, And in real world scenario
        we will have an Order defined like in my case I want the Validation
        Aspect to execute before Logging Aspect so order is assigned a value
        the less the value the first it will be called.

        The Order is:
            1. Validation Aspect is intercepting the method
               then it calls the proceed method.
            2. Now the call delegates to next aspect which calls
               the Logging Aspect
            3. Then Logging Aspect executes its call and intercepts
                the method and returns
            4. Then the call again intercepted by Validation Aspect
                and it then finally returns.

            5. Main returns

     */

    private static final Logger logger = Logger.getLogger(ValidationAspect.class.getName());

    @Around("execution(* services.AreaCalcService.calcArea(..))")
    public Object validateMethod(ProceedingJoinPoint jp) throws Throwable{
        logger.info("Validation Aspect: Calling Proxy");
        Object res = jp.proceed();
        logger.info("Validation Aspect executed and returned: "+res);
        return res;
    }
}
