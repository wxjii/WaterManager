package com.example.watermanager.service.impl;


import com.example.watermanager.domain.Weather;
import com.example.watermanager.repository.WeatherMapper;
import com.example.watermanager.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WeatherServiceImpl implements WeatherService
{

    @Autowired
    private WeatherMapper weatherMapper;


    @Override
    public List<Weather> findAllWeather() {
        return weatherMapper.selectAllWeather();
    }

    @Override
    public int saveWeather(Weather weather) {
        return weatherMapper.insertWeather(weather);
    }
}
