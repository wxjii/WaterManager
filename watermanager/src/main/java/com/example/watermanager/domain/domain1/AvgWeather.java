package com.example.watermanager.domain.domain1;

import org.apache.ibatis.type.Alias;

@Alias("AvgWeather1")
public class AvgWeather {
    @Override
    public String toString() {
        return "AvgWeather{" +
                "wRainfall=" + wRainfall +
                ", wTemperature=" + wTemperature +
                ", wHumidity=" + wHumidity +
                ", wMostrainfall=" + wMostrainfall +
                ", wSpeed=" + wSpeed +
                ", wDirection=" + wDirection +
                '}';
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

    public AvgWeather() {
    }

    public AvgWeather(double wRainfall, double wTemperature, double wHumidity, double wMostrainfall, double wSpeed, double wDirection) {
        this.wRainfall = wRainfall;
        this.wTemperature = wTemperature;
        this.wHumidity = wHumidity;
        this.wMostrainfall = wMostrainfall;
        this.wSpeed = wSpeed;
        this.wDirection = wDirection;
    }

    private double wRainfall;
    private double wTemperature;
    private double wHumidity;
    private double wMostrainfall;
    private double wSpeed;
    private double wDirection;

}
