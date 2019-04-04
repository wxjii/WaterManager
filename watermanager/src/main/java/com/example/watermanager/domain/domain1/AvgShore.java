package com.example.watermanager.domain.domain1;

import org.apache.ibatis.type.Alias;

@Alias("AvgShore1")
public class AvgShore {
    public AvgShore() {
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

    public double getsCod() {
        return sCod;
    }

    public void setsCod(double sCod) {
        this.sCod = sCod;
    }

    public double getsToc() {
        return sToc;
    }

    public void setsToc(double sToc) {
        this.sToc = sToc;
    }

    public double getsAmmonia() {
        return sAmmonia;
    }

    public void setsAmmonia(double sAmmonia) {
        this.sAmmonia = sAmmonia;
    }

    public double getsPhosphate() {
        return sPhosphate;
    }

    public void setsPhosphate(double sPhosphate) {
        this.sPhosphate = sPhosphate;
    }

    public double getsTemperature() {
        return sTemperature;
    }

    public void setsTemperature(double sTemperature) {
        this.sTemperature = sTemperature;
    }

    public double getsConductivity() {
        return sConductivity;
    }

    public void setsConductivity(double sConductivity) {
        this.sConductivity = sConductivity;
    }

    public double getsTurbidity() {
        return sTurbidity;
    }

    public void setsTurbidity(double sTurbidity) {
        this.sTurbidity = sTurbidity;
    }

    public double getsDissolved() {
        return sDissolved;
    }

    public void setsDissolved(double sDissolved) {
        this.sDissolved = sDissolved;
    }

    public double getsPetroleum() {
        return sPetroleum;
    }

    public void setsPetroleum(double sPetroleum) {
        this.sPetroleum = sPetroleum;
    }

    public double getsAlage() {
        return sAlage;
    }

    public void setsAlage(double sAlage) {
        this.sAlage = sAlage;
    }

    public double getsChlorophyll() {
        return sChlorophyll;
    }

    public void setsChlorophyll(double sChlorophyll) {
        this.sChlorophyll = sChlorophyll;
    }

    public double getsNitrogen() {
        return sNitrogen;
    }

    public void setsNitrogen(double sNitrogen) {
        this.sNitrogen = sNitrogen;
    }

    public double getsNitriteNitrogen() {
        return sNitriteNitrogen;
    }

    public void setsNitriteNitrogen(double sNitriteNitrogen) {
        this.sNitriteNitrogen = sNitriteNitrogen;
    }

    public AvgShore(double sPh, double sSuspension, double sBod, double sCod, double sToc, double sAmmonia, double sPhosphate, double sTemperature, double sConductivity, double sTurbidity, double sDissolved, double sPetroleum, double sAlage, double sChlorophyll, double sNitrogen, double sNitriteNitrogen) {
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

    private double sPh;
    private double sSuspension;
    private double sBod;
    private double sCod;
    private double sToc;
    private double sAmmonia;
    private double sPhosphate;
    private double sTemperature;
    private double sConductivity;
    private double sTurbidity;
    private double sDissolved;
    private double sPetroleum;
    private double sAlage;
    private double sChlorophyll;
    private double sNitrogen;
    private double sNitriteNitrogen;

    @Override
    public String toString() {
        return "AvgShore{" +
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
}
