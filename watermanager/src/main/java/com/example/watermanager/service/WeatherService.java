package com.example.watermanager.service;




import com.example.watermanager.domain.Weather;

import java.util.List;

public interface WeatherService {

    /**
     * 查询所有气象数据
     * @return
     */
    List<Weather> findAllWeather();

    /**
     * 添加气象数据
     * @return
     */
    int saveWeather(Weather weather);

}
