package com.example.watermanager.domain;

import org.apache.ibatis.type.Alias;

import java.util.Objects;

@Alias("Monitor")
public class Monitor {
    private int mId;
    private FactorCode factorCode;
    private double mStandardUp;
    private double mStandardDown;
    private double mFiniteUp;
    private double mFiniteDowm;

    public Monitor() {
    }

    public Monitor(int mId, FactorCode factorCode, double mStandardUp, double mStandardDown, double mFiniteUp, double mFiniteDowm, int mEnable) {
        this.mId = mId;
        this.factorCode = factorCode;
        this.mStandardUp = mStandardUp;
        this.mStandardDown = mStandardDown;
        this.mFiniteUp = mFiniteUp;
        this.mFiniteDowm = mFiniteDowm;
        this.mEnable = mEnable;
    }

    public Monitor(FactorCode factorCode, double mStandardUp, double mStandardDown, double mFiniteUp, double mFiniteDowm, int mEnable) {
        this.factorCode = factorCode;
        this.mStandardUp = mStandardUp;
        this.mStandardDown = mStandardDown;
        this.mFiniteUp = mFiniteUp;
        this.mFiniteDowm = mFiniteDowm;
        this.mEnable = mEnable;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "mId=" + mId +
                ", factorCode=" + factorCode +
                ", mStandardUp=" + mStandardUp +
                ", mStandardDown=" + mStandardDown +
                ", mFiniteUp=" + mFiniteUp +
                ", mFiniteDowm=" + mFiniteDowm +
                ", mEnable=" + mEnable +
                '}';
    }

    private int mEnable;

    public FactorCode getFactorCode() {
        return factorCode;
    }

    public void setFactorCode(FactorCode factorCode) {
        this.factorCode = factorCode;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

   
    public double getmStandardUp() {
        return mStandardUp;
    }

    public void setmStandardUp(double mStandardUp) {
        this.mStandardUp = mStandardUp;
    }

   
    public double getmStandardDown() {
        return mStandardDown;
    }

    public void setmStandardDown(double mStandardDown) {
        this.mStandardDown = mStandardDown;
    }

    
    public double getmFiniteUp() {
        return mFiniteUp;
    }

    public void setmFiniteUp(double mFiniteUp) {
        this.mFiniteUp = mFiniteUp;
    }

    public double getmFiniteDowm() {
        return mFiniteDowm;
    }

    public void setmFiniteDowm(double mFiniteDowm) {
        this.mFiniteDowm = mFiniteDowm;
    }

  
    public int getmEnable() {
        return mEnable;
    }

    public void setmEnable(int mEnable) {
        this.mEnable = mEnable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return mId == monitor.mId &&
                Double.compare(monitor.mStandardUp, mStandardUp) == 0 &&
                Double.compare(monitor.mStandardDown, mStandardDown) == 0 &&
                Double.compare(monitor.mFiniteUp, mFiniteUp) == 0 &&
                Double.compare(monitor.mFiniteDowm, mFiniteDowm) == 0 &&
                mEnable == monitor.mEnable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mId, mStandardUp, mStandardDown, mFiniteUp, mFiniteDowm, mEnable);
    }
}
