package com.ramazankayis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//exclude:dahil etmemek
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)
public class EcodationSpringBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcodationSpringBlogApplication.class, args);
    }

}
