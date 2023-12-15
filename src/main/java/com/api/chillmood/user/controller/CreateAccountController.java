package com.api.chillmood.user.controller;

import com.api.chillmood.user.dto.AccountDto;
import com.api.chillmood.user.entity.Account;
import com.api.chillmood.user.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "${app.api.path.version.v1}")
@RequiredArgsConstructor
public class CreateAccountController {

    private final AccountService accountService;

    @GetMapping(path = "${app.api.path.account.createAccount}")
    public Account createAccount(@RequestBody AccountDto newAccount) {
        return accountService.createAccount(newAccount);
    }


}
