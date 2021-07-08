package com.deyuan.service.impl;

import com.deyuan.dao.AccountDao;
import com.deyuan.service.AccountService;

import java.util.*;

/**
 * Create by yanhongbo
 * 日期 2021/6/24
 *
 * @Version 1.0
 */
public class AccountServiceImpl implements AccountService {
    private String uname;
    private Integer age;
    //通过set方法注入
    private String[] myStr;
    private Set<String> mySet;
    private List<String> myList;
    private Map<String,String> myMap;
    private Properties myPros;

    public void setMyStr(String[] myStr) {
        this.myStr = myStr;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyPros(Properties myPros) {
        this.myPros = myPros;
    }

    public AccountServiceImpl() {
    }

    public AccountServiceImpl(String uname, Integer age) {
        this.uname = uname;
        this.age = age;
    }

    private AccountDao accountDao;


    //通过set方法来注入
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Override
    public void saveAccount() {
        System.out.println(uname+"-----"+age);
        System.out.println(Arrays.toString(myStr));
        System.out.println(mySet);
        System.out.println(myList);
        System.out.println(myMap);
        System.out.println(myPros);
        accountDao.saveAccount();
    }
}
