package com.beans.and.di.demo;

import com.beans.and.di.demo.user.UserVisitor;
import com.beans.and.di.demo.user.Visitor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);

        Visitor v = ac.getBean("userVisitor", Visitor.class);

        System.out.println(v.whatAmI());
        System.out.println(v.toString());
        System.out.println(v.doThePurchase());
    }
}
