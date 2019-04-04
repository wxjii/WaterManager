package com.example.watermanager.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("Avgshore")
public class Avgshore implements Serializable {
    private double sPh;
    private double sSuspension;
    private double sBod;
    private Double sCod;
    private Double sToc;
    private Double sAmmonia;
    private Double sPhosphate;
    private Double sTemperature;
    private Double sConductivity;
    private Double sTurbidity;
    private Double sDissolved;
    private Double sPetroleum;
    private Double sAlage;
    private double sChlorophyll;
    private Double sNitrogen;
    private double sNitriteNitrogen;

    public Avgshore() {
    }

    public Avgshore(double sPh, double sSuspension, double sBod, Double sCod, Double sToc, Double sAmmonia, Double sPhosphate, Double sTemperature, Double sConductivity, Double sTurbidity, Double sDissolved, Double sPetroleum, Double sAlage, double sChlorophyll, Double sNitrogen, double sNitriteNitrogen) {
        this.sPh = sPh;
        this.sSuspension = sSuspension;
        this.sBod = sBod;
        this.sCod = sCod;
        this.sToc = sToc;
        this.sAmmonia = sAmmonia;
        this.sPhosphate = sPhosphate;
        this.sTemperature = sTemperature;
        this.sConductivity = sConductivity;
        this.sTurbidity = sTurbidity;
        this.sDissolved = sDissolved;
        this.sPetroleum = sPetroleum;
        this.sAlage = sAlage;
        this.sChlorophyll = sChlorophyll;
        this.sNitrogen = sNitrogen;
        this.sNitriteNitrogen = sNitriteNitrogen;
    }

    @Override
    public String toString() {
        return "Avgshore{" +
                "sPh=" + sPh +
                ", sSuspension=" + sSuspension +
                ", sBod=" + sBod +
                ", sCod=" + sCod +
                ", sToc=" + sToc +
                ", sAmmonia=" + sAmmonia +
                ", sPhosphate=" + sPhosphate +
                ", sTemperature=" + sTemperature +
                ", sConductivity=" + sConductivity +
                ", sTurbidity=" + sTurbidity +
                ", sDissolved=" + sDissolved +
                ", sPetroleum=" + sPetroleum +
                ", sAlage=" + sAlage +
                ", sChlorophyll=" + sChlorophyll +
                ", sNitrogen=" + sNitrogen +
                ", sNitriteNitrogen=" + sNitriteNitrogen +
                '}';
    }

    public double getsPh() {
        return sPh;
    }

    public void setsPh(double sPh) {
        this.sPh = sPh;
    }

    public double getsSuspension() {
        return sSuspension;
    }

    public void setsSuspension(double sSuspension) {
        this.sSuspension = sSuspension;
    }

    public double getsBod() {
        return sBod;
    }

    public void setsBod(double sBod) {
        this.sBod = sBod;
    }

    public Double getsCod() {
        return sCod;
    }

    public void setsCod(Double sCod) {
        this.sCod = sCod;
    }

    public Double getsToc() {
        return sToc;
    }

    public void setsToc(Double sToc) {
        this.sToc = sToc;
    }

    public Double getsAmmonia() {
        return sAmmonia;
    }

    public void setsAmmonia(Double sAmmonia) {
        this.sAmmonia = sAmmonia;
    }

    public Double getsPhosphate() {
        return sPhosphate;
    }

    public void setsPhosphate(Double sPhosphate) {
        this.sPhosphate = sPhosphate;
    }

    public Double getsTemperature() {
        return sTemperature;
    }

    public void setsTemperature(Double sTemperature) {
        this.sTemperature = sTemperature;
    }

    public Double getsConductivity() {
        return sConductivity;
    }

    public void setsConductivity(Double sConductivity) {
        this.sConductivity = sConductivity;
    }

    public Double getsTurbidity() {
        return sTurbidity;
    }

    public void setsTurbidity(Double sTurbidity) {
        this.sTurbidity = sTurbidity;
    }

    public Double getsDissolved() {
        return sDissolved;
    }

    public void setsDissolved(Double sDissolved) {
        this.sDissolved = sDissolved;
    }

    public Double getsPetroleum() {
        return sPetroleum;
    }

    public void setsPetroleum(Double sPetroleum) {
        this.sPetroleum = sPetroleum;
    }

    public Double getsAlage() {
        return sAlage;
    }

    public void setsAlage(Double sAlage) {
        this.sAlage = sAlage;
    }

    public double getsChlorophyll() {
        return sChlorophyll;
    }

    public void setsChlorophyll(double sChlorophyll) {
        this.sChlorophyll = sChlorophyll;
    }

    public Double getsNitrogen() {
        return sNitrogen;
    }

    public void setsNitrogen(Double sNitrogen) {
        this.sNitrogen = sNitrogen;
    }

    public double getsNitriteNitrogen() {
        return sNitriteNitrogen;
    }

    public void setsNitriteNitrogen(double sNitriteNitrogen) {
        this.sNitriteNitrogen = sNitriteNitrogen;
    }
}
