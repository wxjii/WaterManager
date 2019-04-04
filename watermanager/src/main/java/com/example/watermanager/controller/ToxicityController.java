package com.example.watermanager.controller;


import com.example.watermanager.domain.Toxicity;
import com.example.watermanager.service.ToxicityService;
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
public class ToxicityController {

    @Autowired
    private ToxicityService toxicityService;

    @Autowired
    private HttpSession httpSession;

    String name;
    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }

    @RequestMapping("/findToxicity")
    @ResponseBody
    /**
     * 查询最新的10条毒性数据
     */
    public String  selectLatestToxicity(){
         int i;
         if (toxicityService.findAllToxicity()==null){

              i=0;
         }else{
              i=1;
         }
        LogicTest.FileLog(name,"查询最新的10条毒性数据",i);
        return new Gson().toJson(toxicityService.findAllToxicity());
    }


    @RequestMapping("/saveToxicity")
    @ResponseBody
    /**
     * 添加毒性数据
     */
    public String  saveToxicity(@RequestBody Toxicity toxicity){
       int i = toxicityService.saveToxicity(toxicity);
        LogicTest.FileLog(name,"添加毒性数据",i);
       if(i > 0){
           return "毒性数据添加成功！";
       }else {
           return "毒性数据添加失败！";
       }
    }


}
