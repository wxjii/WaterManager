package com.example.watermanager.service.service1.impl;


import com.example.watermanager.domain.domain1.AvgShore;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.Shore;
import com.example.watermanager.repository.repository1.ShoreRepository;
import com.example.watermanager.service.service1.ShoreService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ShoreServiceImpl1 implements ShoreService1 {
    @Autowired
    ShoreRepository shoreRepository;
    @Override
    public List<Shore> realtimedata() {
        return shoreRepository.realtimedata();
    }

    @Override
    public List<Shore> historicalDataOnShore(Date1 date) {
        return shoreRepository.historicalDataOnShore(date);
    }

    @Override
    public AvgShore searchShoreHourData(Date1 date1) {
        return shoreRepository.searchShoreHourData(date1);
    }
}
