package com.example.watermanager.service;

import com.example.watermanager.domain.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AvgweatherServiceTest {
    @Autowired
    AvgweatherService avgweatherService;
    @Test
    public void queryAvgDay(){
        System.out.println(
                avgweatherService.queryAvgDay(
                        new DateUtil("2019-03-19 00:00:00","2019-03-20 00:00:00")));

    }
    @Test
    public void queryAvgMonth(){
        System.out.println(
                avgweatherService.queryAvgMonth(
                        new DateUtil("2019-03-01 00:00:00","2019-04-01 00:00:00")));
    }
    @Test
    public void queryAvgYear(){
        System.out.println(
                avgweatherService.queryAvgYear(
                        new DateUtil("2019-01-01 00:00:00","2020-01-01 00:00:00")));
    }
    @Test
    public void queryAvgWeek(){
        System.out.println(
                avgweatherService.queryAvgWeek(
                        new DateUtil("2019-03-19 00:00:00","2019-03-26 00:00:00")));
    }


}