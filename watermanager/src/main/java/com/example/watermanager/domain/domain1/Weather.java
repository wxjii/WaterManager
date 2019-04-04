package com.example.watermanager.domain.domain1;

import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;
import java.util.Date;

@Alias("Weather1")
public class Weather {
    public Weather() {
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
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

    public double getwMostrainfall() {
        return wMostrainfall;
    }

    public void setwMostrainfall(double wMostrainfall) {
        this.wMostrainfall = wMostrainfall;
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

    public LocalDateTime getwDate() {
        return wDate;
    }

    public void setwDate(LocalDateTime wDate) {
        this.wDate = wDate;
    }

    public Weather(int wId, double wRainfall, double wTemperature, double wHumidity, double wMostrainfall, double wSpeed, double wDirection, LocalDateTime wDate) {
        this.wId = wId;
        this.wRainfall = wRainfall;
        this.wTemperature = wTemperature;
        this.wHumidity = wHumidity;
        this.wMostrainfall = wMostrainfall;
        this.wSpeed = wSpeed;
        this.wDirection = wDirection;
        this.wDate = wDate;
    }

    private int wId;
    private double wRainfall;
    private double wTemperature;
    private double wHumidity;
    private double wMostrainfall;
    private double wSpeed;
    private double wDirection;
    private LocalDateTime wDate;

}
