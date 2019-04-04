package com.example.watermanager.service;

import com.example.watermanager.domain.FactorCode;
import com.example.watermanager.domain.Monitor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MonitorServiceTest {

    /**
     * 监测因子增删该查 测试
     *
     */

    @Autowired
    private MonitorService monitorService;

     @Test
    public void Context(){

          Monitor monitor=new Monitor(10,new FactorCode(2),45,65,12.1,23.4,0);
         monitorService.QueryMonitor(2).forEach(System.out::println);
          monitorService.save(new Monitor(new FactorCode(1),25,36,14,56,1));
           monitorService.deleteMonitorByID(2);
           monitorService.UpdateMonitor(monitor);


     }
}