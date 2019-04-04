package com.example.watermanager.domain;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Alias("AlarmLog")
public class AlarmLog implements Serializable {
    private int idalarmLog;
    private int fcId;
    private String aLMethod;
    private String aLPeople;
    private String aLSchedule;
    private String aLDetails;
    @DateTimeFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date aLTime;

    public AlarmLog(String aLPeople) {
        this.aLPeople = aLPeople;
    }

    public AlarmLog(Date aLTime) {
        this.aLTime = aLTime;
    }

    public AlarmLog() {
    }

    public AlarmLog(int fcId, String aLMethod, String aLPeople, String aLSchedule, String aLDetails) {
        this.fcId = fcId;
        this.aLMethod = aLMethod;
        this.aLPeople = aLPeople;
        this.aLSchedule = aLSchedule;
        this.aLDetails = aLDetails;
    }

    @Override
    public String toString() {
        return "AlarmLog{" +
                "idalarmLog=" + idalarmLog +
                ", fcId=" + fcId +
                ", aLMethod='" + aLMethod + '\'' +
                ", aLPeople='" + aLPeople + '\'' +
                ", aLSchedule='" + aLSchedule + '\'' +
                ", aLDetails='" + aLDetails + '\'' +
                ", aLTime=" + aLTime +
                '}';
    }

    public int getIdalarmLog() {
        return idalarmLog;
    }

    public void setIdalarmLog(int idalarmLog) {
        this.idalarmLog = idalarmLog;
    }

    public Date getaLTime() {
        return aLTime;
    }

    public void setaLTime(Date aLTime) {
        this.aLTime = aLTime;
    }

    public String getaLMethod() {
        return aLMethod;
    }

    public void setaLMethod(String aLMethod) {
        this.aLMethod = aLMethod;
    }


    public String getaLPeople() {
        return aLPeople;
    }

    public void setaLPeople(String aLPeople) {
        this.aLPeople = aLPeople;
    }


    public String getaLSchedule() {
        return aLSchedule;
    }

    public void setaLSchedule(String aLSchedule) {
        this.aLSchedule = aLSchedule;
    }

    public String getaLDetails() {
        return aLDetails;
    }

    public void setaLDetails(String aLDetails) {
        this.aLDetails = aLDetails;
    }

}
