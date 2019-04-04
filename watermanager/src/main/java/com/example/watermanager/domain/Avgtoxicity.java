package com.example.watermanager.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("Avgtoxicity")
public class Avgtoxicity implements Serializable {
    private Double tValue;

    public Avgtoxicity() {
    }

    public Avgtoxicity(Double tValue) {
        this.tValue = tValue;
    }

    public Double gettValue() {
        return tValue;
    }

    public void settValue(Double tValue) {
        this.tValue = tValue;
    }

    @Override
    public String toString() {
        return "Avgtoxicity{" +
                "tValue=" + tValue +
                '}';
    }
}
