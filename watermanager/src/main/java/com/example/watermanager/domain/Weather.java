package com.example.watermanager.domain;


import org.apache.ibatis.type.Alias;


import java.time.LocalDateTime;


@Alias("Weather")
public class Weather {

    private Integer wId;
    private Double wRainfall;
    private Double wTemperature;
    private Double wHumidity;
    private Double wMostRainfall;
    private Double wSpeed;
    private Double wDirection;
    private LocalDateTime wDate;

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public Double getwRainfall() {
        return wRainfall;
    }

    public void setwRainfall(Double wRainfall) {
        this.wRainfall = wRainfall;
    }

    public Double getwTemperature() {
        return wTemperature;
    }

    public void setwTemperature(Double wTemperature) {
        this.wTemperature = wTemperature;
    }

    public Double getwHumidity() {
        return wHumidity;
    }

    public void setwHumidity(Double wHumidity) {
        this.wHumidity = wHumidity;
    }

    public Double getwMostRainfall() {
        return wMostRainfall;
    }

    public void setwMostRainfall(Double wMostRainfall) {
        this.wMostRainfall = wMostRainfall;
    }

    public Double getwSpeed() {
        return wSpeed;
    }

    public void setwSpeed(Double wSpeed) {
        this.wSpeed = wSpeed;
    }

    public LocalDateTime getwDate() {
        return wDate;
    }

    public void setwDate(LocalDateTime wDate) {
        this.wDate = wDate;
    }

    public Double getwDirection() {
        return wDirection;
    }

    public void setwDirection(Double wDirection) {
        this.wDirection = wDirection;
    }

    public Weather(Double wRainfall, Double wTemperature, Double wHumidity, Double wMostRainfall, Double wSpeed, Double wDirection) {
        this.wRainfall = wRainfall;
        this.wTemperature = wTemperature;
        this.wHumidity = wHumidity;
        this.wMostRainfall = wMostRainfall;
        this.wSpeed = wSpeed;
        this.wDirection = wDirection;

    }

    public Weather() {
    }

    @Override
    public String toString() {
        return "Weather{" +
                "wId=" + wId +
                ", wRainfall=" + wRainfall +
                ", wTemperature=" + wTemperature +
                ", wHumidity=" + wHumidity +
                ", wMostRainfall=" + wMostRainfall +
                ", wSpeed=" + wSpeed +
                ", wDirection=" + wDirection +
                ", wDate=" + wDate +
                '}';
    }
}
