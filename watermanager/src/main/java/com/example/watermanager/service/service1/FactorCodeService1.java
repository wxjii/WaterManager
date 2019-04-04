package com.example.watermanager.service.service1;



import com.example.watermanager.domain.domain1.AvgFactorCode;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.FactorCode;


import java.util.List;


public interface FactorCodeService1 {
    List<FactorCode> realtimedata();
    AvgFactorCode queryBuoyHourData(Date1 date);
    List<FactorCode> querySkyData(Date1 date);



}
