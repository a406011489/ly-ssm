package com.ly.ssm.controller;

import com.ly.ssm.entity.Account;
import com.ly.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/a")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/b")
    @ResponseBody
    public String c() {
        System.out.println("query begin");
        try {
            List<Account> accounts = accountService.queryAccountList();
            System.out.println(accounts);
            return "query success";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "query fail";
    }
}
