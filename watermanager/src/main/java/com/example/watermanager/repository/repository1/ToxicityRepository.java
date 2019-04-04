package com.example.watermanager.repository.repository1;



import com.example.watermanager.domain.domain1.AvgToxicity;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.Toxicity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ToxicityRepository {
       List<Toxicity>  toxicityData();
       List<Toxicity> toxicityHistoryData(Date1 date);
   AvgToxicity queryToxicityHourData(Date1 date1);


}
