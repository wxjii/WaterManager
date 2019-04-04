package com.example.watermanager.service.impl;

import com.example.watermanager.domain.Avgshore;
import com.example.watermanager.domain.DateUtil;
import com.example.watermanager.repository.AvgshoreMapper;
import com.example.watermanager.service.AvgshoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AvgshoreServiceImpl implements AvgshoreService {

    @Autowired
    AvgshoreMapper avgshoreMapper;
    @Override
    public List<Avgshore> queryAvgDay(DateUtil date) {
        return avgshoreMapper.queryAvgDay(date);
    }

    @Override
    public List<Avgshore> queryAvgMonth(DateUtil date) {
        return avgshoreMapper.queryAvgMonth(date);
    }

    @Override
    public List<Avgshore> queryAvgYear(DateUtil date) {
        return avgshoreMapper.queryAvgYear(date);
    }

    @Override
    public List<Avgshore> queryAvgWeek(DateUtil date) {
        return avgshoreMapper.queryAvgWeek(date);
    }
}
