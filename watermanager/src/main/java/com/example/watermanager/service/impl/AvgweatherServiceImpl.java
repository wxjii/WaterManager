package com.example.watermanager.service.impl;

import com.example.watermanager.domain.Avgweather;
import com.example.watermanager.domain.DateUtil;
import com.example.watermanager.repository.AvgweatherMapper;
import com.example.watermanager.service.AvgshoreService;
import com.example.watermanager.service.AvgweatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvgweatherServiceImpl implements AvgweatherService {

    @Autowired
    AvgweatherMapper avgweatherMapper;
    @Override
    public List<Avgweather> queryAvgDay(DateUtil date) {
        return avgweatherMapper.queryAvgDay(date);
    }

    @Override
    public List<Avgweather> queryAvgMonth(DateUtil date) {
        return avgweatherMapper.queryAvgMonth(date);
    }

    @Override
    public List<Avgweather> queryAvgYear(DateUtil date) {
        return avgweatherMapper.queryAvgYear(date);
    }

    @Override
    public List<Avgweather> queryAvgWeek(DateUtil date) {
        return avgweatherMapper.queryAvgWeek(date);
    }
}
