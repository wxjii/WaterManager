package com.example.watermanager.service;

import com.example.watermanager.domain.Shore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoreServiceTest {

    @Autowired
    private  ShoreService shoreService;

    Shore shore = new Shore(0.1,0.2,0.3,0.4,0.5,0.4,0.2,0.2,0.3
            ,0.5,0.5,0.5,0.3,0.4,0.5,0.3);

    @Test
    public void ceshi() {
        shoreService.saveShore(shore);
        shoreService.findAllShore().forEach(System.out::println);
    }

}