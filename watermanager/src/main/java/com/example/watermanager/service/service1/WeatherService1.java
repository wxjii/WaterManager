package com.example.watermanager.service.service1;



import com.example.watermanager.domain.domain1.AvgWeather;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.Weather;

import java.util.List;

public interface WeatherService1 {
    Weather weatherData();
    List<Weather> meteorologicalHistoricalData(Date1 date);
    AvgWeather queryWeatherHourData(Date1 date1);
}
