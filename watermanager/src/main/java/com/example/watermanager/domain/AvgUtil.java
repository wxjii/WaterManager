package com.example.watermanager.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("AvgUtil")
public class AvgUtil implements Serializable {
    private double fcPh;
    private double fcSuspension;
    private double fcBod;
    private double fcCod;
    private double fcToc;
    private double fcAmmonia;
    private double fcPhosphate;
    private double fcTemperature;
    private double fcConductivity;
    private double fcTurbidity;
    private double fcDissolved;
    private double fcPetroleum;
    private double fcAlage;
    private double fcChlorophyll;
    private double fcNitrogen;
    private double fcNitriteNitrogen;

    public AvgUtil() {
    }

    public double getFcPh() {
        return fcPh;
    }

    public void setFcPh(double fcPh) {
        this.fcPh = fcPh;
    }

    public double getFcSuspension() {
        return fcSuspension;
    }

    public void setFcSuspension(double fcSuspension) {
        this.fcSuspension = fcSuspension;
    }

    public double getFcBod() {
        return fcBod;
    }

    public void setFcBod(double fcBod) {
        this.fcBod = fcBod;
    }

    public Double getFcCod() {
        return fcCod;
    }

    public void setFcCod(Double fcCod) {
        this.fcCod = fcCod;
    }

    public Double getFcToc() {
        return fcToc;
    }

    public void setFcToc(Double fcToc) {
        this.fcToc = fcToc;
    }

    public Double getFcAmmonia() {
        return fcAmmonia;
    }

    public void setFcAmmonia(Double fcAmmonia) {
        this.fcAmmonia = fcAmmonia;
    }

    public Double getFcPhosphate() {
        return fcPhosphate;
    }

    public void setFcPhosphate(Double fcPhosphate) {
        this.fcPhosphate = fcPhosphate;
    }

    public Double getFcTemperature() {
        return fcTemperature;
    }

    public void setFcTemperature(Double fcTemperature) {
        this.fcTemperature = fcTemperature;
    }

    public Double getFcConductivity() {
        return fcConductivity;
    }

    public void setFcConductivity(Double fcConductivity) {
        this.fcConductivity = fcConductivity;
    }

    public Double getFcTurbidity() {
        return fcTurbidity;
    }

    public void setFcTurbidity(Double fcTurbidity) {
        this.fcTurbidity = fcTurbidity;
    }

    public Double getFcDissolved() {
        return fcDissolved;
    }

    public void setFcDissolved(Double fcDissolved) {
        this.fcDissolved = fcDissolved;
    }

    public Double getFcPetroleum() {
        return fcPetroleum;
    }

    public void setFcPetroleum(Double fcPetroleum) {
        this.fcPetroleum = fcPetroleum;
    }

    public Double getFcAlage() {
        return fcAlage;
    }

    public void setFcAlage(Double fcAlage) {
        this.fcAlage = fcAlage;
    }

    public double getFcChlorophyll() {
        return fcChlorophyll;
    }

    public void setFcChlorophyll(double fcChlorophyll) {
        this.fcChlorophyll = fcChlorophyll;
    }

    public Double getFcNitrogen() {
        return fcNitrogen;
    }

    public void setFcNitrogen(Double fcNitrogen) {
        this.fcNitrogen = fcNitrogen;
    }

    public double getFcNitriteNitrogen() {
        return fcNitriteNitrogen;
    }

    public void setFcNitriteNitrogen(double fcNitriteNitrogen) {
        this.fcNitriteNitrogen = fcNitriteNitrogen;
    }

    @Override
    public String toString() {
        return "AvgUtil{" +
                "fcPh=" + fcPh +
                ", fcSuspension=" + fcSuspension +
                ", fcBod=" + fcBod +
                ", fcCod=" + fcCod +
                ", fcToc=" + fcToc +
                ", fcAmmonia=" + fcAmmonia +
                ", fcPhosphate=" + fcPhosphate +
                ", fcTemperature=" + fcTemperature +
                ", fcConductivity=" + fcConductivity +
                ", fcTurbidity=" + fcTurbidity +
                ", fcDissolved=" + fcDissolved +
                ", fcPetroleum=" + fcPetroleum +
                ", fcAlage=" + fcAlage +
                ", fcChlorophyll=" + fcChlorophyll +
                ", fcNitrogen=" + fcNitrogen +
                ", fcNitriteNitrogen=" + fcNitriteNitrogen +
                '}';
    }
}
