package com.example.watermanager.service;


import com.example.watermanager.domain.AlarmLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AlarmLogsRepositoryServiceTest {
    @Autowired
    AlarmLogsRepositoryService alarmLogsRepositoryService;

    AlarmLog alarmLog=new AlarmLog(1,"aa","v","HH","zz");

    @Test
    public void contextLoads() {


     System.out.println(alarmLogsRepositoryService.findByAlarmLogs());
       alarmLogsRepositoryService.deleteById("2019-03-09 00:00:00");
        alarmLogsRepositoryService.saveByAlarmLogs(alarmLog);


    }

}