package com.example.watermanager.repository;

import com.example.watermanager.domain.AvgUtil;
import com.example.watermanager.domain.Avgweather;
import com.example.watermanager.domain.DateUtil;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AvgweatherMapper {
    List<Avgweather> queryAvgDay(DateUtil date);
    List<Avgweather>  queryAvgMonth(DateUtil date);
    List<Avgweather>  queryAvgYear(DateUtil date);
    List<Avgweather>  queryAvgWeek(DateUtil date);



}
