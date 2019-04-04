package com.example.watermanager.service;

import com.example.watermanager.domain.Date1;
import com.example.watermanager.service.service1.ShoreService1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoreServiceTest1 {
@Autowired
ShoreService1 shoreService;


    @Test
    public void realtimedata() {
        System.out.println(shoreService.realtimedata());
    }

    @Test
    public void historicalDataOnShore() {
        System.out.println(shoreService.searchShoreHourData(
                new Date1("2019-03-19 00:00:00","2019-03-19 01:00:00")));
    }

    @Test
    public void searchShoreHourData() {
        System.out.println(
                new Date1("2019-03-19 00:00:00","2019-03-20 00:00:00"));
    }
}