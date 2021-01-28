package com.fourdkelvin.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.fourdkelvin.framework")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringMixWebApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringMixWebApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringMixWebApplication.class, args);
    }
}
