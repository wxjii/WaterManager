package com.example.watermanager.service.service1.impl;

import com.example.watermanager.domain.domain1.AvgWeather;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.Weather;
import com.example.watermanager.repository.repository1.WeatherRepository;
import com.example.watermanager.service.service1.WeatherService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WeatherServiceImpl1 implements WeatherService1 {
  @Autowired
  WeatherRepository weatherRepository;
    @Override
    public Weather weatherData() {
        return weatherRepository.weatherData();

    }

  @Override
  public List<Weather> meteorologicalHistoricalData(Date1 date) {
    return weatherRepository.meteorologicalHistoricalData(date);
  }

  @Override
  public AvgWeather queryWeatherHourData(Date1 date1) {
    return weatherRepository.queryWeatherHourData(date1);
  }

}
