package com.example.watermanager.controller;


import com.example.watermanager.service.AlarmMessageRepositoryService;
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
public class AlarmMessageController {
    @Autowired
    AlarmMessageRepositoryService alarmMessageRepositoryService;

    @Autowired
    private HttpSession httpSession;

    String name;

    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }


    @RequestMapping(value = "/findAllByMessage",method = RequestMethod.GET)
    @ResponseBody
    public String findAllByMessage() {
        int i;
          if (alarmMessageRepositoryService.findAllByMessage()==null){

               i=0;

          }else{

               i=1;
          }

        LogicTest.FileLog(name,"展示所有查询信息",i);
        return  new Gson().toJson(alarmMessageRepositoryService.findAllByMessage());
    }


    @RequestMapping(value = "/findMessage",method = RequestMethod.GET)
    @ResponseBody
    public String findMessage(){

          int i;
            if (alarmMessageRepositoryService.findMessage()==null){
                i=0;

            }else {

                i=1;
            }
        LogicTest.FileLog(name,"展示所有未处理的信息",i);
        return new Gson().toJson(alarmMessageRepositoryService.findMessage());
    }



}
