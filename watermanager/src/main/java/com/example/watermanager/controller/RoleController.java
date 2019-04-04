package com.example.watermanager.controller;


import com.example.watermanager.domain.Role;
import com.example.watermanager.service.RoleService;
import com.example.watermanager.util.LogicTest;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


/**
 * @Auther:DC
 * @Date:2019/4/3
 * @Description:角色的增删改查
 */
@Controller
public class RoleController {

    /**
     * @param:入参,json格式字符串:{"rName":"张三"}
     * 调用接口:"/saveRole"
     * @return:"添加"
     * */
    @Autowired
    RoleService roleService;


    @Autowired
    private HttpSession httpSession;

    String name;

    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }



    //增
    @RequestMapping(value = "/saveRole",method = RequestMethod.POST)
    @ResponseBody
    public String saveRole(@RequestBody Role role){
       int i = roleService.saveRole(role);

        LogicTest.FileLog(name,"添加联系人",i);
        if (i>0){
            return "添加成功";
        }else{
            return "添加失败";
        }



    }

    //删
    /**
     * @param:入参,json格式字符串:{"rName":"张三"}
     * 调用接口:"/deleteRole"
     * @return:"删除"
     * */
    @RequestMapping(value = "/deleteRole",method = RequestMethod.POST)
    @ResponseBody
    public String deleteRole(@RequestBody Role role){
      int i=  roleService.deleteRole(role);
        LogicTest.FileLog(name,"删除联系人",i);
      if (i>0){
          return "删除成功";
      }else{
          return "删除失败";
      }

    }
    //改
    /**
     * @param:入参,json格式字符串:{"rName":"李四","rId":"1"}
     * 调用接口:"/update"
     * @return:"修改成功"
     * @return:"修改失败"
     * */
    @RequestMapping(value = "/update")
    @ResponseBody
    public String updateUser(@RequestBody Role role){
        int i = roleService.updateRole(role);
        LogicTest.FileLog(name,"修改联系人",i);
        if(i>0){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }
    //查
    /**
     * @param:入参,json格式字符串:{"date":"2019-03-19"}
     * 调用接口:"/queryRole"
     *
     * */
    @RequestMapping(value = "/queryRole",method = RequestMethod.GET)
    @ResponseBody
    public String queryRole(){
          int i;
           if (roleService.queryRole()==null){
                i=0;

           }else{
                i=1;

           }
        LogicTest.FileLog(name,"删除联系人",i);
        return  new Gson().toJson(roleService.queryRole());
    }


}
