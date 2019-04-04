package com.example.watermanager.service;

import com.example.watermanager.domain.Avgtoxicity;
import com.example.watermanager.domain.DateUtil;

import java.util.List;

public interface AvgtoxicityService {
    List<Avgtoxicity> queryAvgDay(DateUtil date);
    List<Avgtoxicity> queryAvgMonth(DateUtil date);
    List<Avgtoxicity> queryAvgYear(DateUtil date);
    List<Avgtoxicity> queryAvgWeek(DateUtil date);
}
