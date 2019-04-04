package com.example.watermanager.repository;

import com.example.watermanager.domain.Monitor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface MonitorMapper {

       List<Monitor> QueryMonitor(@Param("page") Integer page);

       int save(Monitor monitor);

       int UpdateMonitor(Monitor monitor);

       int deleteMonitorByID(@Param("id") Integer id);



}
