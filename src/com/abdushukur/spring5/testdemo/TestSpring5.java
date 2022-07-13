package com.abdushukur.spring5.testdemo;

import com.abdushukur.spring5.autowire.Emp;
import com.abdushukur.spring5.bean.Orders;
import com.abdushukur.spring5.collectiontype.Book;
import com.abdushukur.spring5.collectiontype.Stu;
import com.abdushukur.spring5.factorybean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestSpring5 {

    @Test
    public void testCollection1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void testCollection2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
//        book.test();
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void test3(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        MyBean myBean = context.getBean("myBean", MyBean.class);
        System.out.println(myBean);
    }

    @Test
    public void testBean(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("Step 4 .....");
        System.out.println(orders);

        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void test4(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
