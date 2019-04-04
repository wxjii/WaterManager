package com.example.watermanager.domain;


import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("Toxicity")
public class Toxicity {
    private Integer tId;
    private Double tValue;
    private LocalDateTime tDate;

    public LocalDateTime getsDate() {
        return tDate;
    }

    public void setsDate(LocalDateTime tDate) {
        this.tDate = tDate;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Toxicity(Double tValue) {
        this.tValue = tValue;
    }

    public Double gettValue() {
        return tValue;
    }

    public void settValue(Double tValue) {
        this.tValue = tValue;
    }

    public Toxicity() {
    }

    @Override
    public String toString() {
        return "Toxicity{" +
                "tId=" + tId +
                ", tValue=" + tValue +
                '}';
    }
}
