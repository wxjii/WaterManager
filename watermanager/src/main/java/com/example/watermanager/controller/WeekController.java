package com.example.watermanager.controller;

import com.example.watermanager.domain.*;
import com.example.watermanager.service.AvgUtilService;
import com.example.watermanager.service.AvgshoreService;
import com.example.watermanager.service.AvgtoxicityService;
import com.example.watermanager.service.AvgweatherService;
import com.example.watermanager.util.LogicTest;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @Auther:DengCe
 * @Date:2019/4/3
 * @Description:显示一周每天数据的平均值
 *
 */
@Controller
public class WeekController {
    @Autowired
    AvgUtilService avgUtilService;
    @Autowired
    AvgweatherService avgweatherService;
    @Autowired
    AvgshoreService avgshoreService;
    @Autowired
    AvgtoxicityService avgtoxicityService;

    /**
     * @param:param,入参,json格式字符串:{"date":"2019-03-19"}
     * 调用接口:"/DataSourceWeek"
     * @return:返回一个List
     * */
    @Autowired
    private HttpSession httpSession;

    String name;

    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }

    @RequestMapping(value = "/DataSourceWeek")
    @ResponseBody
    public String DataSourceWeek(@RequestBody Map<String, Object> parms) throws ParseException {
        /**
         *   7 条数据
         *
         */
        String StartTime;
        String EndTime;
        List<AvgUtil> listUtilWeek;
        List<Avgweather> listweatherWeek;
        List<Avgshore> listshoreWeek;
        List<Avgtoxicity> listtoxicityWeek;
        List<List> listAll = new ArrayList<>();
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(parms.get("date").toString());
        //2019-03-19
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        //显示7天每天数据的平均值
        int a=0;
        for (int i = 0;i<7;){
            date.plusDays(i);
            StartTime = stringBuffer.append(date.plusDays(i)).append(" 00:00:00").toString();
            i++;
            EndTime = stringBuffer1.append(date.plusDays(i)).append(" 00:00:00").toString();
            //System.out.println(Suffixdate+"----"+Suffixdate1);
            //System.out.println(StartTime+"----"+EndTime);
            listUtilWeek = avgUtilService.queryAvgWeek(new DateUtil(StartTime, EndTime));
            listweatherWeek = avgweatherService.queryAvgWeek(new DateUtil(StartTime, EndTime));
            listshoreWeek = avgshoreService.queryAvgWeek(new DateUtil(StartTime, EndTime));
            listtoxicityWeek = avgtoxicityService.queryAvgWeek(new DateUtil(StartTime, EndTime));
            listAll.add(listUtilWeek);
            listAll.add(listweatherWeek);
            listAll.add(listshoreWeek);
            listAll.add(listtoxicityWeek);
            stringBuffer.delete(0, 19);
            stringBuffer1.delete(0, 19);
        }

        a=1;
        LogicTest.FileLog(name,"显示一周每天数据的平均值",a);
        return new Gson().toJson(listAll);


    }


}
