package com.example.watermanager.domain;

import org.apache.ibatis.type.Alias;

import java.util.Objects;


@Alias("Contacts")
public class Contacts{
    private int cId;
    private String cName;
    private String cPhone;
    private String cPosition;

    public Contacts() {
    }

    public Contacts(int cId, String cName, String cPhone, String cPosition) {
        this.cId = cId;
        this.cName = cName;
        this.cPhone = cPhone;
        this.cPosition = cPosition;
    }

    public Contacts(String cName, String cPhone, String cPosition) {
        this.cName = cName;
        this.cPhone = cPhone;
        this.cPosition = cPosition;
    }


    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }


    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }


    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }


    public String getcPosition() {
        return cPosition;
    }

    public void setcPosition(String cPosition) {
        this.cPosition = cPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contacts = (Contacts) o;
        return cId == contacts.cId &&
                Objects.equals(cName, contacts.cName) &&
                Objects.equals(cPhone, contacts.cPhone) &&
                Objects.equals(cPosition, contacts.cPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cId, cName, cPhone, cPosition);
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cPhone='" + cPhone + '\'' +
                ", cPosition='" + cPosition + '\'' +
                '}';
    }
}
