package com.example.watermanager.service;

import com.example.watermanager.domain.AvgUtil;
import com.example.watermanager.domain.DateUtil;

import java.util.List;

public interface AvgUtilService {
    List<AvgUtil> queryAvgDay(DateUtil date);
    List<AvgUtil>  queryAvgMonth(DateUtil date);
    List<AvgUtil>  queryAvgYear(DateUtil date);
    List<AvgUtil>  queryAvgWeek(DateUtil date);

}
