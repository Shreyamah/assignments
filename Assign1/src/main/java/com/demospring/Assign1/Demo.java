package com.demospring.Assign1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    Customer c1 = (Customer) context.getBean("customer");
    c1.displayInfo();
  }
}