package com.ingress.authenticationms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AuthenticationMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationMsApplication.class, args);
    }

}
