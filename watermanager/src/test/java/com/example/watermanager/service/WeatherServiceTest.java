package com.example.watermanager.service;


import com.example.watermanager.domain.Weather;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherServiceTest {

    @Autowired
    private  WeatherService weatherService;

    Weather weather =
            new Weather(0.2,0.3,0.4,0.5,0.6,0.7);

    @Test
    public void ceshi() {
        // 查询测试
        weatherService.findAllWeather().forEach(System.out::println);
        //添加测试
        weatherService.saveWeather(weather);
    }

}