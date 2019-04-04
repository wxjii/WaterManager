package com.example.watermanager.domain;

import org.apache.ibatis.type.Alias;

@Alias("Date1")
public class Date1 {
    public Date1() {
    }

    public Date1(String dateA, String dateB) {
        this.dateA = dateA;
        this.dateB = dateB;
    }

    public Date1(String dateA) {
        this.dateA = dateA;
    }

    public String getDateA() {
        return dateA;
    }

    public void setDateA(String dateA) {
        this.dateA = dateA;
    }

    public String getDateB() {
        return dateB;
    }

    public void setDateB(String dateB) {
        this.dateB = dateB;
    }

    private String dateA;
    private String dateB;
//    private int currentPage;
//
//    private int pageSize;



//    public int getCurrentPage() {
//        return currentPage;
//    }
//
//    public void setCurrentPage(int currentPage) {
//        this.currentPage = currentPage;
//    }
//
//    public int getPageSize() {
//        return pageSize;
//    }
//
//    public void setPageSize(int pageSize) {
//        this.pageSize = pageSize;
//    }

}
