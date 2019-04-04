package com.example.watermanager.service.service1.impl;


import com.example.watermanager.domain.domain1.AvgToxicity;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.Toxicity;
import com.example.watermanager.repository.repository1.ToxicityRepository;
import com.example.watermanager.service.service1.ToxicityService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ToxicityServiceImpl1 implements ToxicityService1 {
    @Autowired
    ToxicityRepository toxicityRepository;
    @Override
    public List<Toxicity>  toxicityData() {
        return toxicityRepository.toxicityData();
    }

    @Override
    public List<Toxicity> toxicityHistoryData(Date1 date) {

        return toxicityRepository.toxicityHistoryData(date);
    }

    @Override
    public AvgToxicity queryToxicityHourData(Date1 date1) {
        return toxicityRepository.queryToxicityHourData(date1);
    }
}
