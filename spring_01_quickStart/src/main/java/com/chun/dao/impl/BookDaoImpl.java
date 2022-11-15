package com.chun.dao.impl;

import com.chun.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save(){
        System.out.println("Book dao save ...");
    }

    public void init(){
        System.out.println("init method...");
    }

    public void destroy(){
        System.out.println("destroy method...");
    }



}
