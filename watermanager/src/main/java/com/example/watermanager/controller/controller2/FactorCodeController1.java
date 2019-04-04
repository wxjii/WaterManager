package com.example.watermanager.controller.controller2;


import com.example.watermanager.domain.domain1.AvgFactorCode;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.FactorCode;
import com.example.watermanager.service.service1.FactorCodeService1;
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
import java.lang.String;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class FactorCodeController1 {

    @Autowired
    FactorCodeService1 factorCodeService;

    @Autowired
    private HttpSession httpSession;

    String name;
    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }


    //浮标实时数据
    @RequestMapping("/buoyData")
    @ResponseBody
    public String realtimedata() {
          int i;
        if (factorCodeService.realtimedata()==null){
               i=0;
        }else{
              i=1;
        }
        LogicTest.FileLog(name,"显示浮标实时数据",i);
        List<FactorCode> factorCode = factorCodeService.realtimedata();

        return new Gson().toJson(factorCode);//通过gson.toJson()方法先转为json串
    }

    //浮标历史数据,按小时查询,返回24条平均值
    @RequestMapping("/hourData")
    @ResponseBody
    public String queryHourData(@RequestBody Map<String, Object> date) {

        LocalDateTime time = LocalDateTime.parse(date.get("dateA").toString() + "T00:00:00");
        StringBuffer str = new StringBuffer();
        StringBuffer str1= new StringBuffer();
        List<AvgFactorCode> list = new  ArrayList<>();

        int a=0;
        for (int i = 0; i < 24;) {
            str.setLength(0);
            str1.setLength(0);
          String  time1 = str.append(time.plusHours(i) + ":00").replace(10, 11, " ").toString();
              i++;
            String  time2 = str1.append(time.plusHours(i) + ":00").replace(10, 11, " ").toString();
            str.setLength(0);
            str1.setLength(0);

        AvgFactorCode avgFactorCode = factorCodeService.queryBuoyHourData(new Date1(time1,time2));
              list.add(avgFactorCode);
       }
        a=1;
        LogicTest.FileLog(name,"浮标历史数据,按小时查询,返回24条平均值",a);

        return new Gson().toJson(list); //通过gson.toJson()方法先转为json串
    }


//   浮标历史数据,按天查询，一天返回144条数据,分页显示,每页10条
        @RequestMapping("/buoyHistoryData")
        @ResponseBody
        public String querySkyData (@RequestBody Map<String,Object> date){

            Date1 date1 = new Date1();
            date1.setDateA(date.get("dateA").toString());
            date1.setDateB(date.get("dateB").toString());

            PageHelper.startPage(Integer.parseInt(date.get("CurrentPage").toString()), 10);
            PageInfo<FactorCode> pageInfo = new PageInfo<>(factorCodeService.querySkyData(date1));
               int i;
            if (pageInfo==null){
                i=0;
            }else{
                 i=1;
            }
            LogicTest.FileLog(name,"浮标历史数据,按天查询，一天返回144条数据",i);
            return new Gson().toJson(pageInfo);//通过gson.toJson()方法先转为json串

        }
    }
