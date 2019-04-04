package com.example.watermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Watermanager1Application {

    public static void main(String[] args) {
        SpringApplication.run(Watermanager1Application.class, args);
    }


}
