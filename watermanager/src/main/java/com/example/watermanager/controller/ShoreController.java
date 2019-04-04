package com.example.watermanager.controller;


import com.example.watermanager.domain.Shore;
import com.example.watermanager.service.ShoreService;
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
public class ShoreController {

    @Autowired
    private ShoreService shoreService;

    String name;

    @Autowired
    private HttpSession httpSession;

    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }


    @RequestMapping("/findShore")
    @ResponseBody
    /**
     * 首页显示前10条岸边站数据
     */
    public String  selectLatestShore(){
           int i;
          if (shoreService.findAllShore()==null){

              i=0;

          }else{

              i=1;
          }
        LogicTest.FileLog(name,"首页显示前10条岸边站数据",i);
        return new Gson().toJson(shoreService.findAllShore());
    }

    @RequestMapping("/saveShore")
    @ResponseBody
    /**
     * 添加岸边站数据,用户添加时需要添对应的列名的参数值
     */
    public String  saveShore(@RequestBody Shore shore){
        int  i = shoreService.saveShore(shore);
        LogicTest.FileLog(name,"添加岸边站数据",i);
        if(i > 0){
            return "岸边站数据添加成功！";
        }else {
            return "岸边站数据添加失败！";
        }
    }



}
