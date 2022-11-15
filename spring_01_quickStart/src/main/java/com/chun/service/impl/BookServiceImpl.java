package com.chun.service.impl;

import com.chun.dao.BookDao;
import com.chun.service.BookService;

public class  BookServiceImpl implements BookService {

//    private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save(){
        System.out.println("Book service save....");
        bookDao.save();
    }


}
