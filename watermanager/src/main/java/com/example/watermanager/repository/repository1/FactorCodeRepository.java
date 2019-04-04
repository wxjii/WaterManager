package com.example.watermanager.repository.repository1;



import com.example.watermanager.domain.domain1.AvgFactorCode;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.FactorCode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface FactorCodeRepository{
       List<FactorCode> realtimedata();
    AvgFactorCode queryBuoyHourData(Date1 date);
    List<FactorCode> querySkyData(Date1 date);
}
