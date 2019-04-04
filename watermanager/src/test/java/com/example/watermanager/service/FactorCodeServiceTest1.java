package com.example.watermanager.service;

import com.example.watermanager.domain.Date1;
import com.example.watermanager.service.service1.FactorCodeService1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FactorCodeServiceTest1 {
    @Autowired
    FactorCodeService1 factorCodeService;

    @Test
    public void realtimedata() {
        System.out.println(factorCodeService.realtimedata());
    }

    @Test
    public void queryBuoyHourData() {
        System.out.println(factorCodeService.queryBuoyHourData(
                new Date1("2019-03-19 00:00:00","2019-03-19 01:00:00")));
    }


    @Test
    public void querySkyData() {
        System.out.println(factorCodeService.querySkyData(
                new Date1("2019-03-19 00:00:00","2019-03-20 00:00:00")));
    }
}