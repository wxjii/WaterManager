package com.example.watermanager.repository.repository1;



import com.example.watermanager.domain.domain1.AvgWeather;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.Weather;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WeatherRepository {
    Weather weatherData();
    List<Weather> meteorologicalHistoricalData(Date1 date);
    AvgWeather queryWeatherHourData(Date1 date1);
}
