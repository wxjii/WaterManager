package com.example.watermanager.domain;

import org.apache.ibatis.type.Alias;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Alias("Role")
public class Role {
    private int rId;
    private String rName;

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public Role() {
    }

    public Role( String rName) {
        this.rName = rName;
    }

    public Role(int rId, String rName) {
        this.rId = rId;
        this.rName = rName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                '}';
    }
}
