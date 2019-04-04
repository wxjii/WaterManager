package com.example.watermanager.domain.domain1;

import org.apache.ibatis.type.Alias;

import java.sql.Date;
import java.time.LocalDateTime;



@Alias("FactorCode1")
public class FactorCode {
    private int fcId;
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
    private double fcAlgae;
    private double fcChlorophyll;
    private double fcNitrogen;
    private double fcNitriteNitrogen;
    private LocalDateTime fcDate;

    public FactorCode() {
    }

    public int getFcId() {
        return fcId;
    }

    public void setFcId(int fcId) {
        this.fcId = fcId;
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

    public double getFcCod() {
        return fcCod;
    }

    public void setFcCod(double fcCod) {
        this.fcCod = fcCod;
    }

    public double getFcToc() {
        return fcToc;
    }

    public void setFcToc(double fcToc) {
        this.fcToc = fcToc;
    }

    public double getFcAmmonia() {
        return fcAmmonia;
    }

    public void setFcAmmonia(double fcAmmonia) {
        this.fcAmmonia = fcAmmonia;
    }

    public double getFcPhosphate() {
        return fcPhosphate;
    }

    public void setFcPhosphate(double fcPhosphate) {
        this.fcPhosphate = fcPhosphate;
    }

    public double getFcTemperature() {
        return fcTemperature;
    }

    public void setFcTemperature(double fcTemperature) {
        this.fcTemperature = fcTemperature;
    }

    public double getFcConductivity() {
        return fcConductivity;
    }

    public void setFcConductivity(double fcConductivity) {
        this.fcConductivity = fcConductivity;
    }

    public double getFcTurbidity() {
        return fcTurbidity;
    }

    public void setFcTurbidity(double fcTurbidity) {
        this.fcTurbidity = fcTurbidity;
    }

    public double getFcDissolved() {
        return fcDissolved;
    }

    public void setFcDissolved(double fcDissolved) {
        this.fcDissolved = fcDissolved;
    }

    public double getFcPetroleum() {
        return fcPetroleum;
    }

    public void setFcPetroleum(double fcPetroleum) {
        this.fcPetroleum = fcPetroleum;
    }

    public double getFcAlgae() {
        return fcAlgae;
    }

    public void setFcAlgae(double fcAlgae) {
        this.fcAlgae = fcAlgae;
    }

    public double getFcChlorophyll() {
        return fcChlorophyll;
    }

    public void setFcChlorophyll(double fcChlorophyll) {
        this.fcChlorophyll = fcChlorophyll;
    }

    public double getFcNitrogen() {
        return fcNitrogen;
    }

    public void setFcNitrogen(double fcNitrogen) {
        this.fcNitrogen = fcNitrogen;
    }

    public double getFcNitriteNitrogen() {
        return fcNitriteNitrogen;
    }

    public void setFcNitriteNitrogen(double fcNitriteNitrogen) {
        this.fcNitriteNitrogen = fcNitriteNitrogen;
    }

    public FactorCode(int fcId, double fcPh, double fcSuspension, double fcBod, double fcCod, double fcToc, double fcAmmonia, double fcPhosphate, double fcTemperature, double fcConductivity, double fcTurbidity, double fcDissolved, double fcPetroleum, double fcAlgae, double fcChlorophyll, double fcNitrogen, double fcNitriteNitrogen, LocalDateTime fcDate) {
        this.fcId = fcId;
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
        this.fcAlgae = fcAlgae;
        this.fcChlorophyll = fcChlorophyll;
        this.fcNitrogen = fcNitrogen;
        this.fcNitriteNitrogen = fcNitriteNitrogen;
        this.fcDate = fcDate;
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
                ", fcAlgae=" + fcAlgae +
                ", fcChlorophyll=" + fcChlorophyll +
                ", fcNitrogen=" + fcNitrogen +
                ", fcNitriteNitrogen=" + fcNitriteNitrogen +
                ", fcDate=" + fcDate +
                '}';
    }

    public LocalDateTime getFcDate() {
        return fcDate;
    }

    public void setFcDate(LocalDateTime fcDate) {
        this.fcDate = fcDate;
    }
}
