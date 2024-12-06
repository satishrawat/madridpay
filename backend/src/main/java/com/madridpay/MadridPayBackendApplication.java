package com.madridpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MadridPayBackendApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MadridPayBackendApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MadridPayBackendApplication.class, args);
    }
}
