package com.example.watermanager.controller;


import com.example.watermanager.domain.FactorCode;
import com.example.watermanager.service.FactorCodeService;
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
public class FactorCodeController {

    @Autowired
    private FactorCodeService factorCodeService;

    @Autowired
    private HttpSession httpSession;

    String name;

    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }

    @RequestMapping("/findFactorCode")
    @ResponseBody
    /**
     * 查询最新的10条浮标数据
     */
    public String  selectLatestFactorCode(){
           int i;
        if (factorCodeService.findAllFactorCode()==null){
              i=0;

        }else{
              i=1;
        }
        LogicTest.FileLog(name,"查询最新的10条浮标数据",i++);
        return new Gson().toJson(factorCodeService.findAllFactorCode());
    }

    @RequestMapping("/saveFactorCode")
    @ResponseBody
    /**
     * 添加浮标数据,用户添加时需要添对应的列名的参数值
     */
    public String  saveFactorCode(@RequestBody FactorCode factorCode){
        int  i = factorCodeService.saveFactorCode(factorCode);
        LogicTest.FileLog(name,"添加浮标数据",i);
        if(i > 0){
            return "浮标数据添加成功！";
        }else {
            return "浮标数据添加失败！";
        }
    }





}
