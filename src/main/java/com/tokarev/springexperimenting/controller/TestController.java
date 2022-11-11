package com.tokarev.springexperimenting.controller;

import com.tokarev.springexperimenting.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value="/service", method = RequestMethod.GET)
    public String serviceMethod() {
        testService.testAspect();
        return "OK";
    }

    @RequestMapping(value="/interface", method = RequestMethod.GET)
    public String defaultInterfaceMethod() {
        testService.defaultMethod();
        return "OK";
    }
}
