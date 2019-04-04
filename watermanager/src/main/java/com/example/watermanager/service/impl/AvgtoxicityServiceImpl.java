package com.example.watermanager.service.impl;

import com.example.watermanager.domain.Avgtoxicity;
import com.example.watermanager.domain.DateUtil;
import com.example.watermanager.repository.AvgtoxicityMapper;
import com.example.watermanager.service.AvgtoxicityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvgtoxicityServiceImpl implements AvgtoxicityService {

    @Autowired
    AvgtoxicityMapper avgtoxicityMapper;
    @Override
    public List<Avgtoxicity> queryAvgDay(DateUtil date) {
        return avgtoxicityMapper.queryAvgDay(date);
    }

    @Override
    public List<Avgtoxicity> queryAvgMonth(DateUtil date) {
        return avgtoxicityMapper.queryAvgMonth(date);
    }

    @Override
    public List<Avgtoxicity> queryAvgYear(DateUtil date) {
        return avgtoxicityMapper.queryAvgYear(date);
    }

    @Override
    public List<Avgtoxicity> queryAvgWeek(DateUtil date) {
        return avgtoxicityMapper.queryAvgWeek(date);
    }
}
