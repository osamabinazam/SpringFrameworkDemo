package com.example.beandemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBean.xml");
        MyBean bean  = (MyBean) context.getBean("myBean");
        bean.showMessage();
    }
}
