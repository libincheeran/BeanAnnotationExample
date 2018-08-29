package com.libin.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig
{

    @Bean
    public Msg getMsg() {
        return new Msg("hello");
    }
}
