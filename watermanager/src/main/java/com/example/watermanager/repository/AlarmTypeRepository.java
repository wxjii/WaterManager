package com.example.watermanager.repository;



import com.example.watermanager.domain.AlarmType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AlarmTypeRepository{
    //查询类别
    List<AlarmType> findAllByType();
}
