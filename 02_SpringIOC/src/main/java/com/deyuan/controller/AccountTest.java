package com.deyuan.controller;

import com.deyuan.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by yanhongbo
 * 日期 2021/6/24
 *
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        System.out.println(as);
        as.saveAccount();
    }
}
