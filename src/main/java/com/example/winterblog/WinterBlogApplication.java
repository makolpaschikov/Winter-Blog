package com.example.winterblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author makolpaschikov
 */
@SpringBootApplication
public class WinterBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(WinterBlogApplication.class, args);
    }
}
