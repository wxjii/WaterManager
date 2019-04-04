package com.example.watermanager.controller.controller2;


import com.example.watermanager.domain.domain1.AvgWeather;
import com.example.watermanager.domain.Date1;
import com.example.watermanager.domain.domain1.Weather;
import com.example.watermanager.service.service1.WeatherService1;
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
public class WeatherController1 {
    @Autowired
    WeatherService1 weatherService;

    @Autowired
    private HttpSession httpSession;

    String name;
    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }

    //返回一条气象数据
    @RequestMapping("/weather")
    @ResponseBody
    public Weather weather(){
        int i;
        if (weatherService.weatherData()==null){
            i=0;
        }else{
            i=1;
        }
        LogicTest.FileLog(name,"显示气象实时数据",i);
        return weatherService.weatherData();

    }




    //返回一天24条气象数据
    @RequestMapping("/queryWeatherHourData")
    @ResponseBody
    public String queryWeatherHourData(@RequestBody Map<String,Object> date){
        LocalDateTime time = LocalDateTime.parse(date.get("dateA").toString() + "T00:00:00");
        StringBuffer str = new StringBuffer();
        StringBuffer str1= new StringBuffer();
        List<AvgWeather> list = new  ArrayList<>();
        int a=0;
        for (int i = 0; i < 24;) {
            str.setLength(0);
            str1.setLength(0);
            String  time1 = str.append(time.plusHours(i) + ":00").replace(10, 11, " ").toString();
            i++;
            String  time2 = str1.append(time.plusHours(i) + ":00").replace(10, 11, " ").toString();
            str.setLength(0);
            str1.setLength(0);

            AvgWeather avgWeather = weatherService.queryWeatherHourData(new Date1(time1,time2));
            list.add(avgWeather);
        }
        a=1;
        LogicTest.FileLog(name,"气象历史数据,按小时查询,返回24条平均值",a);
        return new Gson().toJson(list);

    }

    //气象历史数据,按天查询,一天返回144条数据
    @RequestMapping("/meteorologicalHistoricalData")
    @ResponseBody
    public String weather(@RequestBody Map<String,Object> date){

        Date1 date1 = new Date1();
        date1.setDateA(date.get("dateA").toString());
        date1.setDateB(date.get("dateB").toString());

        PageHelper.startPage(Integer.parseInt(date.get("CurrentPage").toString()), 10);
        PageInfo<Weather> pageInfo = new PageInfo<>(weatherService.meteorologicalHistoricalData(date1));
        int i;
        if (pageInfo==null){
            i=0;
        }else{
            i=1;
        }
        LogicTest.FileLog(name,"气象历史数据,按天查询，一天返回144条数据",i);
        return new Gson().toJson(pageInfo); //通过gson.toJson()方法先转为json串


    }
}
