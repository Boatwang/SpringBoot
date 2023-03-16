package com.guide.service.impl;

import com.guide.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @CreateTime 2023/3/15-15 14:58
 * @Author wangchunran
 * @Description
 */
@Service
public class MyAccountService implements AccountService {

    private int money;


    @Autowired
    public MyAccountService(){

    }

    public MyAccountService(int money){
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(){

    }
}
