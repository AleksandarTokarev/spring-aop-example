package com.tokarev.springexperimenting.service;

import com.tokarev.springexperimenting.annotation.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service
//@LogExecutionTime
public class TestServiceImpl implements TestService {
    @Override
//    @LogExecutionTime
    public void testAspect() {
        System.out.println("1");
    }
}
