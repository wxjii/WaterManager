package com.example.watermanager.repository;

import com.example.watermanager.domain.Avgtoxicity;
import com.example.watermanager.domain.DateUtil;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AvgtoxicityMapper {
    List<Avgtoxicity> queryAvgDay(DateUtil date);
    List<Avgtoxicity> queryAvgMonth(DateUtil date);
    List<Avgtoxicity> queryAvgYear(DateUtil date);
    List<Avgtoxicity> queryAvgWeek(DateUtil date);


}
