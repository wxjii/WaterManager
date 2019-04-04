package com.example.watermanager.service;

import com.example.watermanager.domain.Date1;
import com.example.watermanager.service.service1.WeatherService1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherServiceTest1 {
@Autowired
WeatherService1 weatherService;
    @Test
    public void weatherData() {
        System.out.println(weatherService.weatherData());
    }

    @Test
    public void meteorologicalHistoricalData() {
        System.out.println(weatherService.queryWeatherHourData(
                new Date1("2019-03-19 00:00:00","2019-03-19 01:00:00")));
    }

    @Test
    public void queryWeatherHourData() {
        System.out.println(weatherService.queryWeatherHourData(
                new Date1("2019-03-19 00:00:00","2019-03-20 00:00:00")));
    }
}