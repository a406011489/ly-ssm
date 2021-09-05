package com.ly.ssm.service;

import com.ly.ssm.entity.Account;
import com.ly.ssm.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> queryAccountList() throws Exception {
        return accountMapper.queryAccountList();
    }
}
