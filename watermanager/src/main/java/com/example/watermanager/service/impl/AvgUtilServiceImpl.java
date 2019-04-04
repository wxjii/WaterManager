package com.example.watermanager.service.impl;

import com.example.watermanager.domain.AvgUtil;
import com.example.watermanager.domain.DateUtil;
import com.example.watermanager.repository.AvgUtilMapper;
import com.example.watermanager.service.AvgUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AvgUtilServiceImpl implements AvgUtilService {

    @Autowired
    AvgUtilMapper avgUtilMapper;
    @Override
    public List<AvgUtil> queryAvgDay(DateUtil date) {
        return avgUtilMapper.queryAvgDay(date);
    }

    @Override
    public List<AvgUtil> queryAvgMonth(DateUtil date) {
        return avgUtilMapper.queryAvgMonth(date);
    }

    @Override
    public List<AvgUtil> queryAvgYear(DateUtil date) {
        return avgUtilMapper.queryAvgYear(date);
    }

    @Override
    public List<AvgUtil> queryAvgWeek(DateUtil date) {
        return avgUtilMapper.queryAvgWeek(date);
    }
}
