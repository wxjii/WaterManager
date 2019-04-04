package com.example.watermanager.service.impl;



import com.example.watermanager.domain.AlarmLog;
import com.example.watermanager.repository.AlarmLogsRepository;
import com.example.watermanager.service.AlarmLogsRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class AlarmLogsRepositoryServiceImpl implements AlarmLogsRepositoryService {
    @Autowired
    AlarmLogsRepository alarmLogsRepository;




    @Override
    public int deleteById(String time) {
        return alarmLogsRepository.deleteById(time);
    }

    @Override
    public List<AlarmLog> findByAlarmLogs() {
        return alarmLogsRepository.findByAlarmLogs();
    }

    @Override
    public int saveByAlarmLogs(AlarmLog alarmLog) {
        return alarmLogsRepository.saveByAlarmLogs(alarmLog);
    }

}
