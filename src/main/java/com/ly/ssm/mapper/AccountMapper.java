package com.ly.ssm.mapper;

import com.ly.ssm.entity.Account;

import java.util.List;

public interface AccountMapper {
    List<Account> queryAccountList() throws Exception;
}
