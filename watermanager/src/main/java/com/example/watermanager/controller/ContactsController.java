package com.example.watermanager.controller;

import com.example.watermanager.domain.Contacts;
import com.example.watermanager.service.ContactsService;
import com.example.watermanager.util.LogicTest;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ContactsController {

     @Autowired

     private ContactsService contactsService;


    @Autowired
    private HttpSession httpSession;

    String name;

    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }

    @RequestMapping("/QueryContacts")
    @ResponseBody
    public String home(){
        int i=0;
          if (contactsService.QueryContacts()!=null)
          {
                i=1;

          }
        LogicTest.FileLog(name,"查询所有联系人",i);
        return new Gson().toJson(contactsService.QueryContacts());
    }

    @RequestMapping("/deletePerson")
    @ResponseBody
     public String deletePerson(@RequestBody Map<String,Object> parm){
             int i= contactsService.deleteContacts(Integer.parseInt(parm.get("person").toString()));
             LogicTest.FileLog(name,"删除联系人",i);
              if (i>0){
                  return "删除成功";
              }
              return "删除失败";
    }

    @RequestMapping("/addPerson")
    @ResponseBody

    public String savePerson(@RequestBody Contacts contacts){

        int i=  contactsService.saveContacts(contacts);
        LogicTest.FileLog(name,"添加联系人",i);

        if (i>0){
            return "添加成功";

        }
      return "添加失败";

    }
    @RequestMapping("/updatePerson")
    @ResponseBody
    public String UpdatePerson(@RequestBody Contacts contacts){

     int a=  contactsService.UpdateContacts(contacts);
       LogicTest.FileLog(name,"修改联系人",a);
       if (a>0){
           return "修改成功";
       }
       return "删除失败";

    }

}
