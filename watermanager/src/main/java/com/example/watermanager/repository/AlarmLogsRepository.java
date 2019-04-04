package com.example.watermanager.repository;

import com.example.watermanager.domain.AlarmLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface AlarmLogsRepository{ //报警日志
    //按照时间删除
    int deleteById(@Param("time") String time);
    //查询所有的告警信息
    List<AlarmLog> findByAlarmLogs();
    //储存
    int saveByAlarmLogs(AlarmLog alarmLog);




//    List<AlarmLog> findByLos(AlarmLog alarmLog);
}
