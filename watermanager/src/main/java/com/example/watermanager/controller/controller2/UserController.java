package com.example.watermanager.controller.controller2;


import com.example.watermanager.domain.User;
import com.example.watermanager.service.service1.UserService;
import com.example.watermanager.util.LogicTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;


@Controller
public class UserController {
    @Autowired
    UserService userService;

 @Autowired
 HttpSession httpSession;


    //MD5解密
    public static String JM(String inStr) {
        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] ^ 't');
        }
        String k = new String(a);
        return k;
    }

    //用户登录
    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestBody Map<String,Object> param){
        String a = UserController.JM(param.get("password").toString());
             User user1 = userService.userLogin(param.get("name").toString());
              String c = UserController.JM(user1.getuPassword());//解析数据库中用户密码
                if(a.equals(c)){
                    httpSession.setAttribute("name",user1.getuName());

                    LogicTest.FileLog(httpSession.getAttribute("name").toString(),"用户登录",1);
                    return "1";  //跳转到首页
                }else {
                    LogicTest.FileLog(httpSession.getAttribute("name").toString(),"用户登录",0);
                    return "输入的用户名或密码无效";
                }

        }

        //退出返回登录界面
        @RequestMapping("/loginOut")
        public String loginOut(){
        LogicTest.FileLog(httpSession.getAttribute("name").toString(),"退出返回登录界面",1);
           return "redirect:/登录页面";
        }





}
