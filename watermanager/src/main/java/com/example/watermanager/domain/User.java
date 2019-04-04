package com.example.watermanager.domain;

import org.apache.ibatis.type.Alias;
import java.util.Objects;


@Alias("User")
public class User {
    private int uId;
    private int pId;
    private int rId;
    private String uLoginName;
    private String uPassword;
    private String uName;

    public User() {
    }

    public User(String uLoginName, String uPassword) {
        this.uLoginName = uLoginName;
        this.uPassword = uPassword;
    }


    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }


    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }


    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String getuLoginName() {
        return uLoginName;
    }

    public void setuLoginName(String uLoginName) {
        this.uLoginName = uLoginName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return uId == user.uId &&
                pId == user.pId &&
                rId == user.rId &&
                Objects.equals(uLoginName, user.uLoginName) &&
                Objects.equals(uPassword, user.uPassword) &&
                Objects.equals(uName, user.uName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uId, pId, rId, uLoginName, uPassword, uName);
    }
}
