package com.example.watermanager.service;

import com.example.watermanager.domain.Avgshore;
import com.example.watermanager.domain.DateUtil;

import java.util.List;

public interface AvgshoreService {
    List<Avgshore> queryAvgDay(DateUtil date);
    List<Avgshore> queryAvgMonth(DateUtil date);
    List<Avgshore> queryAvgYear(DateUtil date);
    List<Avgshore> queryAvgWeek(DateUtil date);

}
