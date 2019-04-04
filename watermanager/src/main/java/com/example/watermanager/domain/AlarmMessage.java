package com.example.watermanager.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.sql.Date;

@Alias("AlarmMessage")
public class AlarmMessage implements Serializable {
    private int aMId;
    private Monitor monitor;
    private AlarmType alarmType;
    private Date aMTime;
    private String aMLimits;
    private String aMScope;
    private String aMValue;

    @Override
    public String toString() {
        return "AlarmMessage{" +
                "aMId=" + aMId +
                ", monitor=" + monitor +
                ", alarmType=" + alarmType +
                ", aMTime=" + aMTime +
                ", aMLimits='" + aMLimits + '\'' +
                ", aMScope='" + aMScope + '\'' +
                ", aMValue='" + aMValue + '\'' +
                '}';
    }

    public AlarmMessage(int aMId, Monitor monitor, AlarmType alarmType, Date aMTime, String aMLimits, String aMScope, String aMValue) {
        this.aMId = aMId;
        this.monitor = monitor;
        this.alarmType = alarmType;
        this.aMTime = aMTime;
        this.aMLimits = aMLimits;
        this.aMScope = aMScope;
        this.aMValue = aMValue;
    }

    public AlarmMessage() {
    }

    public int getaMId() {
        return aMId;
    }

    public void setaMId(int aMId) {
        this.aMId = aMId;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public AlarmType getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(AlarmType alarmType) {
        this.alarmType = alarmType;
    }

    public Date getaMTime() {
        return aMTime;
    }

    public void setaMTime(Date aMTime) {
        this.aMTime = aMTime;
    }


    public String getaMLimits() {
        return aMLimits;
    }

    public void setaMLimits(String aMLimits) {
        this.aMLimits = aMLimits;
    }


    public String getaMScope() {
        return aMScope;
    }

    public void setaMScope(String aMScope) {
        this.aMScope = aMScope;
    }


    public String getaMValue() {
        return aMValue;
    }

    public void setaMValue(String aMValue) {
        this.aMValue = aMValue;
    }

}
