package com.example.watermanager.service.impl;

import com.example.watermanager.domain.Monitor;
import com.example.watermanager.repository.MonitorMapper;
import com.example.watermanager.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MonitorServiceImpl implements MonitorService {

    @Autowired

    private MonitorMapper monitorMapper;

    @Override
    public List<Monitor> QueryMonitor(Integer page) {
        return monitorMapper.QueryMonitor(page);
    }

    @Override
    public int save(Monitor monitor) {
        return monitorMapper.save(monitor);
    }

    @Override
    public int UpdateMonitor(Monitor monitor) {
        return monitorMapper.UpdateMonitor(monitor);
    }

    @Override
    public int deleteMonitorByID(Integer id) {
        return monitorMapper.deleteMonitorByID(id);
    }
}
