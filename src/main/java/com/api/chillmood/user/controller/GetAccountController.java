package com.api.chillmood.user.controller;

import com.api.chillmood.user.entity.Account;
import com.api.chillmood.user.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${app.api.path.version.v1}")
@RequiredArgsConstructor
public class GetAccountController {

    private final AccountService accountService;

    @GetMapping(path = "${app.api.path.account.getAccount}")
    public Account getAccount(@RequestParam(required = false) String name) {
        return accountService.getAccountByName(name);
    }

}
