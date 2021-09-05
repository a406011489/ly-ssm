package com.ly.ssm.service;

import com.ly.ssm.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account>  queryAccountList() throws Exception;
}
