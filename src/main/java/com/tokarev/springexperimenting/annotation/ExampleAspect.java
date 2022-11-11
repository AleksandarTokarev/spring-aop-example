package com.tokarev.springexperimenting.annotation;

import org.apache.juli.logging.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect {

    // Works on method level
//    @Around("@annotation(logExecutionTime)")
//    public Object logExecutionTime2(ProceedingJoinPoint joinPoint, LogExecutionTime logExecutionTime) throws Throwable {
//        long start = System.currentTimeMillis();
//
//        Object proceed = joinPoint.proceed();
//
//        long executionTime = System.currentTimeMillis() - start;
//
//        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
//        return proceed;
//    }


    // Works on class level
//    @Around("@within(logExecutionTime)")
//    public Object method(ProceedingJoinPoint joinPoint, LogExecutionTime logExecutionTime) throws Throwable {
//        System.out.println("OK");
//        return joinPoint.proceed();
//    }


    // Works on class level
//    @Around("@target(logExecutionTime) && within(com.tokarev..*)\")")
//    public Object invokeService(ProceedingJoinPoint pjp, LogExecutionTime logExecutionTime) throws Throwable {
//        System.out.println("OK");
//        return pjp.proceed();
//    }


    // Works both on class and method level
    @Around("@within(logExecutionTime) || @annotation(logExecutionTime)")
    public Object method(ProceedingJoinPoint joinPoint, LogExecutionTime logExecutionTime) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;

        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return proceed;
    }
}