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
 * @Description:显示一年每个月数据的平均值
 *
 */
@Controller
public class YearController {
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
     * @param:param,入参,json格式字符串:{"date":"2019"}
     * 调用接口:"/DataSourceYear"
     * @return:返回一个List
     * */

    @RequestMapping(value = "/DataSourceYear")
    @ResponseBody
    public String DataSourceWeek(@RequestBody Map<String, Object> parms) throws ParseException {
        /**
         *   12条数据
         *
         */
        String StartTime;
        String EndTime;
        List<AvgUtil> listUtilYear;
        List<Avgweather> listweatherYear;
        List<Avgshore> listshoreYear;
        List<Avgtoxicity> listtoxicityYear;
        List<List> listAll = new ArrayList<>();
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(parms.get("date").toString()+"-01-01");
        //2019-03
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        //显示7天每天数据的平均值
        int a=0;
        for (int i = 0;i<1;){
            StartTime = stringBuffer.append(date.plusYears(i)).append(" 00:00:00").toString();
            i++;
            EndTime = stringBuffer1.append(date.plusYears(i)).append(" 00:00:00").toString();
            //System.out.println(Suffixdate+"----"+Suffixdate1);
            //System.out.println(StartTime+"----"+EndTime);
            listUtilYear = avgUtilService.queryAvgYear(new DateUtil(StartTime, EndTime));
            listweatherYear = avgweatherService.queryAvgYear(new DateUtil(StartTime, EndTime));
            listshoreYear = avgshoreService.queryAvgYear(new DateUtil(StartTime, EndTime));
            listtoxicityYear = avgtoxicityService.queryAvgYear(new DateUtil(StartTime, EndTime));
            listAll.add(listUtilYear);
            listAll.add(listweatherYear);
            listAll.add(listshoreYear);
            listAll.add(listtoxicityYear);
            stringBuffer.delete(0, 19);
            stringBuffer1.delete(0, 19);
        }
        a=1;
        LogicTest.FileLog(name,"显示一年每个月数据的平均值",a);
        return new Gson().toJson(listAll);


    }


}
