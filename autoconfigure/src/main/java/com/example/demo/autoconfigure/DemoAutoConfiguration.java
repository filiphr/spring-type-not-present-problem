package com.example.demo.autoconfigure;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.api.DemoCommandLineRunner;

/**
 * @author Filip Hrisafov
 */
@Configuration
//@ConditionalOnClass(DemoCommandLineRunner.class)
public class DemoAutoConfiguration {

    @Bean
    @ConditionalOnClass(DemoCommandLineRunner.class)
    public CommandLineRunner demoCommandLineRunner() {
        return new DemoCommandLineRunner();
    }
}
