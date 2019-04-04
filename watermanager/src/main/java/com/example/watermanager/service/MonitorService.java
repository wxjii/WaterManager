package com.example.watermanager.service;

import com.example.watermanager.domain.Monitor;

import java.util.List;

public interface MonitorService {

    List<Monitor> QueryMonitor(Integer page);

    int save(Monitor monitor);

    int UpdateMonitor(Monitor monitor);

    int deleteMonitorByID(Integer id);



}
