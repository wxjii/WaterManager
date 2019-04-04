package com.example.watermanager.repository.repository1;



import com.example.watermanager.domain.domain1.AvgShore;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.Shore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoreRepository {
    List<Shore> realtimedata();
    List<Shore> historicalDataOnShore(Date1 date);
    AvgShore searchShoreHourData(Date1 date1);
}
