package com.example.watermanager.controller;
import com.example.watermanager.domain.Monitor;
import com.example.watermanager.service.MonitorService;
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
public class MonitorController {

    @Autowired

    private MonitorService monitorService;


    @Autowired
    private HttpSession httpSession;
    String name;

    @ModelAttribute()
    public void text(){
        name=httpSession.getAttribute("name").toString();
    }

    /**
     *
     * @param  {parm:1}  1是用户点的页数
     * @return
     */

    @RequestMapping("/MonitorQuery")
    @ResponseBody
    public String MonitorQuery(@RequestBody Map<String,Object> parm){

        int  i;
         try{

             Integer page=Integer.parseInt(parm.get("page").toString());
             i=1;
             LogicTest.FileLog(name,"查询全部监测因子",i);
             return new Gson().toJson(monitorService.QueryMonitor(page));

         }catch (Exception e){
             i =0;
             e.printStackTrace();
             return "出现错误";
         }

       }

    /**
     *
     * @param {"id":1} 1是用户删除因子的id
     * @return
     */
    @RequestMapping("/deleteQuery")
    @ResponseBody
    public String deleteQuery(@RequestBody Map<String,Object> parm){

        try{
            Integer id=Integer.parseInt(parm.get("id").toString());


            int i=   monitorService.deleteMonitorByID(id);
            LogicTest.FileLog(name,"删除监测因子",i);
            if (i>0){
                return "删除成功";

            }
            return  "删除失败";

        }catch (Exception e){
             e.printStackTrace();

         return "删除成功";

        }
    }

    /**
     *
     * @param {}传修改的内容和因子ID
     * @return
     */
    @RequestMapping("/UpdateMonitor")
    @ResponseBody
    public String UpdateMonitor(@RequestBody Monitor monitor){

      try{

          int i=monitorService.UpdateMonitor(monitor);
          LogicTest.FileLog(name,"删除因子信息",i);

          if (i>0){
              return "修改成功";

          }

      }catch (Exception e){
           e.printStackTrace();
          return  "修改失败";

      }
       return "修改成功";

    }

    /**
     *
     * @param {}传添加内容
     * @return
     */
    @RequestMapping("/saveMonitor")
    @ResponseBody
    public String saveMonitor(@RequestBody Monitor monitor){
    try{

       int i=monitorService.save(monitor);
        LogicTest.FileLog(name,"添加因子信息",i);

       if (i>0){
           return "添加成功";

       }


   }catch (Exception e){
        e.printStackTrace();

       return  "添加失败";

   }

     return "添加成功";
    }


}
