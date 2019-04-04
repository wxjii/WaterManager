package com.example.watermanager.service.service1;



import com.example.watermanager.domain.domain1.AvgToxicity;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.Toxicity;

import java.util.List;

public interface ToxicityService1 {
    List<Toxicity>  toxicityData();
    List<Toxicity> toxicityHistoryData(Date1 date);
    AvgToxicity queryToxicityHourData(Date1 date1);

}
