package tn.esprit.projectkaddem.Aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @Before("execution(* tn.esprit.projectkaddem.services.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getSimpleName();
        if(name.startsWith("get")){
            log.info("entre to method "+name +  " from " +className);
        }
    }
    @After("execution(* tn.esprit.projectkaddem.services.*.*(..))")
    public void logMethodExit(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        String type = joinPoint.getSignature().getDeclaringTypeName();
            log.info("out of method "+ name);
    }

}
