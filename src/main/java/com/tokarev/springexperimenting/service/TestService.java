package com.tokarev.springexperimenting.service;

import com.tokarev.springexperimenting.annotation.LogExecutionTime;

//@LogExecutionTime
public interface TestService {

    @LogExecutionTime
    void testAspect();

//    @LogExecutionTime
    default void defaultMethod() {
        System.out.println("Ok default method");
    }
}
