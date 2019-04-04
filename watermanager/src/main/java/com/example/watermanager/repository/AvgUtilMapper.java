package com.example.watermanager.repository;

import com.example.watermanager.domain.AvgUtil;
import com.example.watermanager.domain.DateUtil;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AvgUtilMapper {
    List<AvgUtil>  queryAvgDay(DateUtil date);
    List<AvgUtil>  queryAvgMonth(DateUtil date);
    List<AvgUtil>  queryAvgYear(DateUtil date);
    List<AvgUtil>  queryAvgWeek(DateUtil date);

}
