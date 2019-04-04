package com.example.watermanager.service.service1;



import com.example.watermanager.domain.domain1.AvgShore;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.Shore;

import java.util.List;

public interface ShoreService1 {
    List<Shore> realtimedata();
    List<Shore> historicalDataOnShore(Date1 date);
    AvgShore searchShoreHourData(Date1 date1);
}
