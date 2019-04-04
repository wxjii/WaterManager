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
 * @Auther:DC
 * @Date:2019/4/3
 * @Description:显示一个月每天数据的平均值
 *
 */
@Controller
public class MonthController {
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


    /**
     * @param:param,入参,json格式字符串:{"date":"2019-03"}
     * 调用接口:"/DataSourceYue"
     * @return:返回一个List
     * */
    @RequestMapping(value = "/DataSourceYue")
    @ResponseBody
    public String DataSourceWeek(@RequestBody Map<String, Object> parms) throws ParseException {
        /**
         *   30条数据
         *
         */
        String StartTime;
        String EndTime;
        List<AvgUtil> listUtilMonth;
        List<Avgweather> listweatherMonth;
        List<Avgshore> listshoreMonth;
        List<Avgtoxicity> listtoxicityMonth;
        List<List> listAll = new ArrayList<>();
        LocalDate date = LocalDate.parse(parms.get("date").toString()+"-01");
        //2019-03
        //2019-04
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        //显示7天每天数据的平均值

        int a=0;
        for (int i = 0;i<1;){
            StartTime = stringBuffer.append(date.plusMonths(i)).append(" 00:00:00").toString();
            i++;
            EndTime = stringBuffer1.append(date.plusMonths(i)).append(" 00:00:00").toString();
            //System.out.println(Suffixdate+"----"+Suffixdate1);
            //System.out.println(StartTime+"----"+EndTime);
            listUtilMonth = avgUtilService.queryAvgMonth(new DateUtil(StartTime, EndTime));
            listweatherMonth = avgweatherService.queryAvgMonth(new DateUtil(StartTime, EndTime));
            listshoreMonth = avgshoreService.queryAvgMonth(new DateUtil(StartTime, EndTime));
            listtoxicityMonth = avgtoxicityService.queryAvgMonth(new DateUtil(StartTime, EndTime));
            listAll.add(listUtilMonth);
            listAll.add(listweatherMonth);
            listAll.add(listshoreMonth);
            listAll.add(listtoxicityMonth);
            stringBuffer.delete(0, 19);
            stringBuffer1.delete(0, 19);
        }
         a=1;
        LogicTest.FileLog(name,"显示一个月每天数据的平均值",a);

        return new Gson().toJson(listAll);


    }


}
