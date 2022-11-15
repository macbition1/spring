package com.chun;

import com.chun.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        //Get IoC container
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Get beans
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        //close virtual machine
//        ctx.registerShutdownHook();
        ctx.close();

    }
}
