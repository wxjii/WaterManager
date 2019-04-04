package com.example.watermanager.domain.domain1;

import org.apache.ibatis.type.Alias;

@Alias("AvgToxicity1")
public class AvgToxicity {
    private String tValue;

    @Override
    public String toString() {
        return "AvgToxicity{" +
                "tName='" + tValue + '\'' +
                '}';
    }

    public String gettName() {
        return tValue;
    }

    public void settName(String tName) {
        this.tValue = tName;
    }

    public AvgToxicity() {
    }

    public AvgToxicity(String tName) {
        this.tValue = tName;
    }
}
