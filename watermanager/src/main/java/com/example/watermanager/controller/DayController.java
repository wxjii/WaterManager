package com.example.watermanager.controller;

import com.example.watermanager.domain.*;
import com.example.watermanager.service.*;
import com.example.watermanager.util.LogicTest;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Auther:DC
 * @Date:2019/4/3
 * @Description:显示一天数据每个小时的平均值
 */
@Controller
public class    DayController {
    @Autowired
    AvgUtilService avgUtilService;
    @Autowired
    AvgweatherService avgweatherService;
    @Autowired
    AvgshoreService avgshoreService;
    @Autowired
    AvgtoxicityService avgtoxicityService;

    @Autowired
    private HttpSession httpSession;

    String name;

    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }

    @RequestMapping(value = "/DataSourceDay")
    @ResponseBody
    public String DataSourceDay(@RequestBody Map<String, Object> parms) {
        /**
         * @param:param,入参,json格式字符串:{"date":"2019-03-19"}
         * 调用接口:"/DataSourceDay"
         * @return:返回一个List
         * */
        String StartTime;
        String EndTime;
        List<AvgUtil> listUtilDay;
        List<Avgweather> listweatherDay;
        List<Avgshore> listshoreDay;
        List<Avgtoxicity> listtoxicityDay;
        List<List> listAll = new ArrayList<>();
        //2019-01-01T00:00:00
        LocalDateTime date = LocalDateTime.parse(parms.get("date").toString() + "T00:00:00");
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        int a=0;
        for (int i = 0; i < 24; ) {
            StartTime = stringBuffer.append(date.plusHours(i) + ":00").replace(10, 11, " ").toString();
            i++;
            EndTime = stringBuffer1.append(date.plusHours(i) + ":00").replace(10, 11, " ").toString();
            stringBuffer.delete(0, 19);
            stringBuffer1.delete(0, 19);
           // System.out.println(StartTime+"----"+EndTime);
            listUtilDay = avgUtilService.queryAvgDay(new DateUtil(StartTime, EndTime));
            listweatherDay = avgweatherService.queryAvgDay(new DateUtil(StartTime, EndTime));
            listshoreDay = avgshoreService.queryAvgDay(new DateUtil(StartTime, EndTime));
            listtoxicityDay = avgtoxicityService.queryAvgDay(new DateUtil(StartTime, EndTime));
            listAll.add(listUtilDay);
            listAll.add(listweatherDay);
            listAll.add(listshoreDay);
            listAll.add(listtoxicityDay);
        }
        a=1;

        LogicTest.FileLog(name,"显示一天数据每个小时的平均值",a);

        return new Gson().toJson(listAll);
    }
}






