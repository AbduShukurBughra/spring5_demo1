package com.abdushukur.spring5.testdemo;

import com.abdushukur.spring5.User;
import com.abdushukur.spring5.bean.Emp;
import com.abdushukur.spring5.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestBean {

    @Test
    public void testBean1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();

    }

    @Test
    public void testBean2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");

        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.add();
    }

    @Test
    public void testBean3(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");

        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.add();
    }
}
