package com.libin.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    // msg is autowired from the configurations defined in MyConfig class with @Bean Annotation.
    @Autowired
    private Msg msg;

    @GetMapping("/add/{value1}/{value2}")
    public Integer add(@PathVariable(name = "value1") int val1,
                       @PathVariable(name = "value2") int val2){
        final String msg = this.msg.getMsg();
        return val1 + val2;
    }
}
