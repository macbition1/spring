package com.chun;

import com.chun.dao.BookDao;
import com.chun.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        //Get IoC container
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        BookService bookService = (BookService) ctx.getBean("bookService");
//        bookService.save();

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);

    }
}
