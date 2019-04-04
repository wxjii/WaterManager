package com.example.watermanager.controller;

import com.example.watermanager.service.AlarmLogsRepositoryService;
import com.example.watermanager.util.LogicTest;
import com.google.gson.Gson;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.Map;

@Controller
public class AlarmLodController {

    @Autowired
  private AlarmLogsRepositoryService alarmLogsRepositoryService;

    @Autowired
    private  HttpSession httpSession;

    String name;
    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }


    @RequestMapping(value = "/findByAlarmLogs",method = RequestMethod.GET)
    @ResponseBody
    public String findByAlarmLogs() {
           int i;
          if (alarmLogsRepositoryService.findByAlarmLogs()==null){
                 i=0;

          }else{
                i=1;

          }

        LogicTest.FileLog(name,"查询告警信息",i);
        return  new Gson().toJson(alarmLogsRepositoryService.findByAlarmLogs());
    }



    @RequestMapping(value = "/deleteById",method = RequestMethod.GET)
    @ResponseBody
    public String deleteById(@RequestBody Map<String,Object> parm) throws ParseException {
       /*  String s=parm.get("aLTime").toString();
         LocalDateTime localDateTime= LocalDateTime.parse(s);
          System.out.println(localDateTime);*/
        System.out.println(parm.get("aLTime").toString());
       int i = alarmLogsRepositoryService.deleteById(parm.get("aLTime").toString());

        LogicTest.FileLog(name,"根据时间删除告警信息",i);
     if (i>0){
          return "删除成功";
     }else {
         return "false";
     }

    }


}
