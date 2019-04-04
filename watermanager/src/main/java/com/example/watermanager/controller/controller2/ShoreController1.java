package com.example.watermanager.controller.controller2;


import com.example.watermanager.domain.domain1.AvgShore;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.Shore;
import com.example.watermanager.service.service1.ShoreService1;
import com.example.watermanager.util.LogicTest;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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


@Controller
public class ShoreController1 {

    @Autowired
    ShoreService1 shoreService;
    @Autowired
    private HttpSession httpSession;

    String name;
    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }
    //岸边数据
    @RequestMapping("/shoreData")
    @ResponseBody
    public String realtimedata(){
     List<Shore> shores = shoreService.realtimedata();
        int i;
        if (shoreService.realtimedata()==null){
            i=0;
        }else{
            i=1;
        }
        LogicTest.FileLog(name,"显示岸边实时数据",i);
        return  new Gson().toJson(shores);//通过gson.toJson()方法先转为json串

    }

    @RequestMapping("/searchShoreHourData")
    @ResponseBody
    public String queryHourData(@RequestBody Map<String,Object> date){
        LocalDateTime time = LocalDateTime.parse(date.get("dateA").toString() + "T00:00:00");
        StringBuffer str = new StringBuffer();
        StringBuffer str1= new StringBuffer();
        List<AvgShore> list = new  ArrayList<>();
        int a=0;
        for (int i = 0; i < 24;) {
            str.setLength(0);
            str1.setLength(0);
            String  time1 = str.append(time.plusHours(i) + ":00").replace(10, 11, " ").toString();
            i++;
            String  time2 = str1.append(time.plusHours(i) + ":00").replace(10, 11, " ").toString();
            str.setLength(0);
            str1.setLength(0);

            AvgShore avgFactorCode = shoreService.searchShoreHourData(new Date1(time1,time2));
            list.add(avgFactorCode);
        }
        a=1;
        LogicTest.FileLog(name,"岸边历史数据,按小时查询,返回24条平均值",a);
        return new Gson().toJson(list); //通过gson.toJson()方法先转为json串
    }



    //岸边历史数据
    @RequestMapping("/historicalDataOnShore")
    @ResponseBody
    public String historicalDataOnShore(@RequestBody Map<String,Object> date){

        Date1 date1 = new Date1();
        date1.setDateA(date.get("dateA").toString());
        date1.setDateB(date.get("dateB").toString());
        PageHelper.startPage(Integer.parseInt(date.get("CurrentPage").toString()), 10);
        PageInfo<Shore> pageInfo = new PageInfo<>(shoreService.historicalDataOnShore(date1));
        int i;
        if (pageInfo==null){
            i=0;
        }else{
            i=1;
        }
        LogicTest.FileLog(name,"岸边历史数据,按天查询，一天返回144条数据",i);
        return  new Gson().toJson(pageInfo);//通过gson.toJson()方法先转为json串


    }
}
