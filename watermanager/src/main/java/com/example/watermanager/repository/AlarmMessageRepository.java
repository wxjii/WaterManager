package com.example.watermanager.repository;


import com.example.watermanager.domain.AlarmMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AlarmMessageRepository{

    //告警信息展示
    List<AlarmMessage> findAllByMessage();

    //查询告警信息:(返回多少未处理的信息)
    List<AlarmMessage> findMessage();



//    int deleteAlarmMessage(int id);
//    int saveByMessage(AlarmMessage alarmMessage);
}
