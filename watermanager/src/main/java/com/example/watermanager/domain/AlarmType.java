package com.example.watermanager.domain;


import java.io.Serializable;


public class AlarmType implements Serializable {
    private int aTId;
    private String aTName;

    @Override
    public String toString() {
        return "AlarmType{" +
                "aTId=" + aTId +
                ", aTName='" + aTName + '\'' +
                '}';
    }

    public AlarmType(int aTId, String aTName) {
        this.aTId = aTId;
        this.aTName = aTName;
    }

    public AlarmType() {
    }

    public int getaTId() {
        return aTId;
    }

    public void setaTId(int aTId) {
        this.aTId = aTId;
    }

    public String getaTName() {
        return aTName;
    }

    public void setaTName(String aTName) {
        this.aTName = aTName;
    }


}
