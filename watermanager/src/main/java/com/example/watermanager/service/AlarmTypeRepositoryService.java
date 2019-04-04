package com.example.watermanager.service;


import com.example.watermanager.domain.AlarmType;

import java.util.List;

public interface AlarmTypeRepositoryService {


    List<AlarmType> findAllByType();







//    int deleteAlarmTypeById(int id);
//    int saveAlarmType(AlarmType alarmType);
}
