package com.example.watermanager.service.service1.impl;



import com.example.watermanager.domain.domain1.AvgFactorCode;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.FactorCode;
import com.example.watermanager.repository.repository1.FactorCodeRepository;
import com.example.watermanager.service.service1.FactorCodeService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class FactorCodeServiceImpl1 implements FactorCodeService1 {
    @Autowired
    FactorCodeRepository factorCodeRepository;


    @Override
    public List<FactorCode> realtimedata() {
        return factorCodeRepository.realtimedata();

    }

    @Override
    public AvgFactorCode queryBuoyHourData(Date1 date) {
        return factorCodeRepository.queryBuoyHourData(date);
    }




    @Override
    public List<FactorCode> querySkyData(Date1 date) {
       return  factorCodeRepository.querySkyData(date);

    }
}
