package com.chun.dao.impl;

import com.chun.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String dataBaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public void save(){
        System.out.println("Book dao save..." + connectionNum +"," + dataBaseName);
    }

    public void init(){
        System.out.println("init method...");
    }

    public void destroy(){
        System.out.println("destroy method...");
    }



}
