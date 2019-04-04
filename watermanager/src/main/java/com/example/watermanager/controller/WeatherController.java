package com.example.watermanager.controller;


import com.example.watermanager.domain.Weather;
import com.example.watermanager.service.WeatherService;
import com.example.watermanager.util.LogicTest;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;


@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private HttpSession httpSession;

    String name;
    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }

    @RequestMapping("/findWeather")
    @ResponseBody
    /**
     * 返回气象数据  首页显示前10条气象数据
     */
    public String  selectLatestWeather(){

           int i;
         if (weatherService.findAllWeather()==null){
              i=0;
         }else{
              i=1;
         }
        LogicTest.FileLog(name,"显示气象数据十条",i);
        return new Gson().toJson(weatherService.findAllWeather());
    }


    @RequestMapping("/saveWeather")
    @ResponseBody
    /**
     * 添加时，用户需要传递weather对应的字段参数和对应的值
     */
    public String  saveWeather(@RequestBody Weather weather){
        int i = weatherService.saveWeather(weather);
        LogicTest.FileLog(name,"添加气象数据",i);
        if(i>0){
            return "添加气象数据成功";
        }else {
            return "添加气象数据失败";
        }
    }




}
