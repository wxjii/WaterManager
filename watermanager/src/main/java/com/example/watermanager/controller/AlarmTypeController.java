package com.example.watermanager.controller;


import com.example.watermanager.service.AlarmMessageRepositoryService;
import com.example.watermanager.service.AlarmTypeRepositoryService;
import com.example.watermanager.util.LogicTest;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class AlarmTypeController {
    @Autowired
    AlarmTypeRepositoryService alarmTypeRepositoryService;

    @Autowired
    AlarmMessageRepositoryService alarmMessageRepositoryService;

    @Autowired
    private HttpSession httpSession;

    String name;

    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }

    @RequestMapping(value = "/findAllByType",method = RequestMethod.GET)
    @ResponseBody
    public String findAllByType() {

         int i;
        if (alarmTypeRepositoryService.findAllByType()==null){

             i=0;
        }else{

             i=1;
        }
        LogicTest.FileLog(name,"显示告警信息的类别",i);
        return  new Gson().toJson(alarmTypeRepositoryService.findAllByType());
    }


}
