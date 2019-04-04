package com.example.watermanager.service;

import com.example.watermanager.service.service1.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
@Autowired
UserService userService;
    @Test
    public void userLogin() {
        System.out.println(userService.userLogin("mcy"));
    }
}