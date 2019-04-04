package com.example.watermanager.repository;


import com.example.watermanager.domain.Weather;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WeatherMapper {

    /**
     * 查询气象数据 显示最新的10条
     * @return
     */
    List<Weather>  selectAllWeather();

    /**
     * 添加气象数据
     * @param weather
     * @return
     */
    int insertWeather(Weather weather);

}
