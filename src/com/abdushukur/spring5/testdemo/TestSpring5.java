package com.abdushukur.spring5.testdemo;

import com.abdushukur.spring5.Book;
import com.abdushukur.spring5.Orders;
import com.abdushukur.spring5.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestSpring5 {

    @Test
    public void testAdd(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();

    }

    @Test
    public void testBook1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();

    }

    @Test
    public void testOrders(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.ordersTest();

    }

}
