package com.example.watermanager.service;

import com.example.watermanager.domain.AlarmMessage;

import java.util.List;

public interface AlarmMessageRepositoryService {
    List<AlarmMessage> findAllByMessage();
    List<AlarmMessage> findMessage();















//    int deleteAlarmMessage(int id);
//    int saveByMessage(AlarmMessage alarmMessage);
}
