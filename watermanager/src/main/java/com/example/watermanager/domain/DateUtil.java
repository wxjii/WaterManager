package com.example.watermanager.domain;

import org.apache.ibatis.type.Alias;

@Alias("DateUtil")
public class DateUtil {

      private String  prefixdate;

      private String  suffixdate;


    public DateUtil() {
    }

    public DateUtil(String prefixdate, String suffixdate) {
        this.prefixdate = prefixdate;
        this.suffixdate = suffixdate;
    }

    public String getPrefixdate() {
        return prefixdate;
    }

    public void setPrefixdate(String prefixdate) {
        this.prefixdate = prefixdate;
    }

    public String getsuffixdate() {
        return suffixdate;
    }

    public void setSuffixdate(String suffixdate) {
        suffixdate = suffixdate;
    }
}
