package com.example.watermanager.service;

import com.example.watermanager.domain.Date1;
import com.example.watermanager.service.service1.ToxicityService1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ToxicityServiceTest1 {
@Autowired
ToxicityService1 toxicityService;
    @Test
    public void toxicityData() {
        System.out.println(toxicityService.toxicityData());
    }

    @Test
    public void toxicityHistoryData() {
        System.out.println(toxicityService.queryToxicityHourData(
                new Date1("2019-03-19 00:00:00","2019-03-19 01:00:00")));
    }

    @Test
    public void queryToxicityHourData() {
        System.out.println(toxicityService.toxicityHistoryData(
                new Date1("2019-03-19 00:00:00","2019-03-20 00:00:00")));
    }
}