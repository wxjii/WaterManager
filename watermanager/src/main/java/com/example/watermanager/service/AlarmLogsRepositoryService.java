package com.example.watermanager.service;

import com.example.watermanager.domain.AlarmLog;

import java.util.List;


public interface AlarmLogsRepositoryService {

    int deleteById(String time);
    List<AlarmLog> findByAlarmLogs();

    int saveByAlarmLogs(AlarmLog alarmLog);






























//    List<AlarmLog> findByLos(AlarmLog alarmLog);
//    int saveByAlarmLogs(AlarmLog alarmLog);
}
