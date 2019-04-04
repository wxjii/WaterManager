package com.example.watermanager.repository;

import com.example.watermanager.domain.Avgshore;
import com.example.watermanager.domain.DateUtil;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AvgshoreMapper {
    List<Avgshore> queryAvgDay(DateUtil date);
    List<Avgshore> queryAvgMonth(DateUtil date);
    List<Avgshore> queryAvgYear(DateUtil date);
    List<Avgshore> queryAvgWeek(DateUtil date);

}
