package com.example.watermanager.domain;


import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

/**
 * 岸边站信息
 */
@Alias("Shore")
public class Shore {
    private Integer sId;
    private Double sPh;
    private Double sSuspension;
    private Double sBod;
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
    private Double sChlorophyll;
    private Double sNitrogen;
    private Double sNitriteNitrogen;
    private LocalDateTime sDate;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Double getsPh() {
        return sPh;
    }

    public void setsPh(Double sPh) {
        this.sPh = sPh;
    }

    public Double getsSuspension() {
        return sSuspension;
    }

    public void setsSuspension(Double sSuspension) {
        this.sSuspension = sSuspension;
    }

    public Double getsBod() {
        return sBod;
    }

    public void setsBod(Double sBod) {
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

    public Double getsChlorophyll() {
        return sChlorophyll;
    }

    public void setsChlorophyll(Double sChlorophyll) {
        this.sChlorophyll = sChlorophyll;
    }

    public Double getsNitrogen() {
        return sNitrogen;
    }

    public void setsNitrogen(Double sNitrogen) {
        this.sNitrogen = sNitrogen;
    }

    public Double getsNitriteNitrogen() {
        return sNitriteNitrogen;
    }

    public void setsNitriteNitrogen(Double sNitriteNitrogen) {
        this.sNitriteNitrogen = sNitriteNitrogen;
    }

    public LocalDateTime getsDate() {
        return sDate;
    }

    public void setsDate(LocalDateTime sDate) {
        this.sDate = sDate;
    }

    public Shore(Double sPh, Double sSuspension, Double sBod, Double sCod, Double sToc, Double sAmmonia, Double sPhosphate, Double sTemperature, Double sConductivity, Double sTurbidity, Double sDissolved, Double sPetroleum, Double sAlage, Double sChlorophyll, Double sNitrogen, Double sNitriteNitrogen) {
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

    public Shore() {
    }

    @Override
    public String toString() {
        return "Shore{" +
                "sId=" + sId +
                ", sPh=" + sPh +
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
                ", sDate=" + sDate +
                '}';
    }
}
