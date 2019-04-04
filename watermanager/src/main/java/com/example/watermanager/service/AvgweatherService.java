package com.example.watermanager.service;

import com.example.watermanager.domain.Avgweather;
import com.example.watermanager.domain.DateUtil;

import java.util.List;

public interface AvgweatherService {
    List<Avgweather> queryAvgDay(DateUtil date);
    List<Avgweather> queryAvgMonth(DateUtil date);
    List<Avgweather>  queryAvgYear(DateUtil date);
    List<Avgweather>  queryAvgWeek(DateUtil date);
}
