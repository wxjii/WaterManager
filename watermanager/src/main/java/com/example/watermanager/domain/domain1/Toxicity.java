package com.example.watermanager.domain.domain1;

import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;
import java.util.Date;

@Alias("Toxicity1")
public class Toxicity {
    public Toxicity() {
    }

    private int tId;
    private LocalDateTime tDate;
    private String tValue;
    public LocalDateTime gettDate() {
        return tDate;
    }

    public void settDate(LocalDateTime tDate) {
        this.tDate = tDate;
    }

    public Toxicity(int tId, LocalDateTime tDate, String tValue) {
        this.tId = tId;
        this.tDate = tDate;
        this.tValue = tValue;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tValue;
    }

    public void settName(String tName) {
        this.tValue = tName;
    }



}
