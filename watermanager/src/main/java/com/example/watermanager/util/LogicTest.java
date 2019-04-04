package com.example.watermanager.util;

import java.io.*;
import java.time.LocalDateTime;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;

public class LogicTest {


    public static void FileLog(String name, Object object, int i) {


       // i=1 成功  i=0 失败

       LocalDateTime localDate =LocalDateTime.now();

        String contxt = "用户：" + name + "   " + "工作:" + object + "   " + "时间:" + LocalDateTime.now()+"  "+"是否成功 " +"   "+ i;

        BufferedWriter out = null;

        try {
            out = new BufferedWriter(new OutputStreamWriter(
                                        //日志文件存储位置
                    new FileOutputStream("/home/log", true)));
            /**
             *  把日志的数据 按天数隔开。
             *
             *

             */
            if (localDate.getHour()==12){
                out.write("\r\n");
                out.write(localDate.toString());
                out.write("\r\n");
                out.write("————————————————————————————————————————————————————————————————");

                out.write("\r\n");

            }

            out.write(contxt + "\r\n");
            out.flush();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
