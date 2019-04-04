package com.example.watermanager.domain;


import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("FactorCode")
public class FactorCode {
    private Integer fcId;
    private Double fcPh;
    private Double fcSuspension;
    private Double fcBod;
    private Double fcCod;
    private Double fcToc;
    private Double fcAmmonia;
    private Double fcPhosphate;
    private Double fcTemperature;
    private Double fcConductivity;
    private Double fcTurbidity;
    private Double fcDissolved;
    private Double fcPetroleum;
    private Double fcAlage;
    private Double fcChlorophyll;
    private Double fcNitrogen;
    private Double fcNitriteNitrogen;
    private LocalDateTime fcDate;


    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public Double getFcPh() {
        return fcPh;
    }

    public void setFcPh(Double fcPh) {
        this.fcPh = fcPh;
    }

    public Double getFcSuspension() {
        return fcSuspension;
    }

    public void setFcSuspension(Double fcSuspension) {
        this.fcSuspension = fcSuspension;
    }

    public Double getFcBod() {
        return fcBod;
    }

    public void setFcBod(Double fcBod) {
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

    public Double getFcChlorophyll() {
        return fcChlorophyll;
    }

    public void setFcChlorophyll(Double fcChlorophyll) {
        this.fcChlorophyll = fcChlorophyll;
    }

    public Double getFcNitrogen() {
        return fcNitrogen;
    }

    public void setFcNitrogen(Double fcNitrogen) {
        this.fcNitrogen = fcNitrogen;
    }

    public Double getFcNitriteNitrogen() {
        return fcNitriteNitrogen;
    }

    public void setFcNitriteNitrogen(Double fcNitriteNitrogen) {
        this.fcNitriteNitrogen = fcNitriteNitrogen;
    }

    public LocalDateTime getFcDate() {
        return fcDate;
    }

    public void setFcDate(LocalDateTime fcDate) {
        this.fcDate = fcDate;
    }

    public FactorCode(Double fcPh, Double fcSuspension, Double fcBod, Double fcCod, Double fcToc, Double fcAmmonia, Double fcPhosphate, Double fcTemperature, Double fcConductivity, Double fcTurbidity, Double fcDissolved, Double fcPetroleum, Double fcAlage, Double fcChlorophyll, Double fcNitrogen, Double fcNitriteNitrogen) {
        this.fcPh = fcPh;
        this.fcSuspension = fcSuspension;
        this.fcBod = fcBod;
        this.fcCod = fcCod;
        this.fcToc = fcToc;
        this.fcAmmonia = fcAmmonia;
        this.fcPhosphate = fcPhosphate;
        this.fcTemperature = fcTemperature;
        this.fcConductivity = fcConductivity;
        this.fcTurbidity = fcTurbidity;
        this.fcDissolved = fcDissolved;
        this.fcPetroleum = fcPetroleum;
        this.fcAlage = fcAlage;
        this.fcChlorophyll = fcChlorophyll;
        this.fcNitrogen = fcNitrogen;
        this.fcNitriteNitrogen = fcNitriteNitrogen;

    }

    public FactorCode() {
    }

    public FactorCode(Integer fcId) {
        this.fcId = fcId;
    }

    @Override
    public String toString() {
        return "FactorCode{" +
                "fcId=" + fcId +
                ", fcPh=" + fcPh +
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
                ", fcDate=" + fcDate +
                '}';
    }
}
