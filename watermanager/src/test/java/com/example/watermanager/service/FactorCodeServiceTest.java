package com.example.watermanager.service;


import com.example.watermanager.domain.FactorCode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactorCodeServiceTest {

    @Autowired
    private  FactorCodeService factorCodeService;

    FactorCode factorCode = new FactorCode(0.1,0.2,0.3,0.4,0.5,0.4,0.2,0.2,0.3
            ,0.5,0.5,0.5,0.3,0.4,0.5,0.3);

    @Test
    public void ceshi() {
        factorCodeService.saveFactorCode(factorCode);
        factorCodeService.findAllFactorCode().forEach(System.out::println);
    }
}