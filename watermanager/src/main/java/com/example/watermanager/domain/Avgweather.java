package com.example.watermanager.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("Avgweather")
public class Avgweather implements Serializable {
    private double wRainfall;
    private double wTemperature;
    private double wHumidity;
    private double wMostRainfall;
    private double wSpeed;
    private double wDirection;

    public Avgweather() {
    }

    @Override
    public String toString() {
        return "Avgweather{" +
                "wRainfall=" + wRainfall +
                ", wTemperature=" + wTemperature +
                ", wHumidity=" + wHumidity +
                ", wMostRainfall=" + wMostRainfall +
                ", wSpeed=" + wSpeed +
                ", wDirection=" + wDirection +
                '}';
    }

    public Avgweather(double wDirection) {
        this.wDirection = wDirection;
    }

    public double getwRainfall() {
        return wRainfall;
    }

    public void setwRainfall(double wRainfall) {
        this.wRainfall = wRainfall;
    }

    public double getwTemperature() {
        return wTemperature;
    }

    public void setwTemperature(double wTemperature) {
        this.wTemperature = wTemperature;
    }

    public double getwHumidity() {
        return wHumidity;
    }

    public void setwHumidity(double wHumidity) {
        this.wHumidity = wHumidity;
    }

    public double getwMostRainfall() {
        return wMostRainfall;
    }

    public void setwMostRainfall(double wMostRainfall) {
        this.wMostRainfall = wMostRainfall;
    }

    public double getwSpeed() {
        return wSpeed;
    }

    public void setwSpeed(double wSpeed) {
        this.wSpeed = wSpeed;
    }

    public double getwDirection() {
        return wDirection;
    }

    public void setwDirection(double wDirection) {
        this.wDirection = wDirection;
    }
}
