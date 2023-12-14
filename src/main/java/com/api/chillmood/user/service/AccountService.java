package com.api.chillmood.user.service;

import com.api.chillmood.user.dto.AccountDto;
import com.api.chillmood.user.entity.Account;
import com.api.chillmood.user.persistence.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class AccountService {

    private final AccountRepository accountRepository;

    public Account getAccountByName(String name) {
        return accountRepository.findByName(name);
    }

    public Account createAccount(AccountDto newUser) {
        //TODO: Validate and convert dto to entity
        log.traceEntry("With account creation requst: ", newUser);
        Account nAccount = Account.builder()
                .name(newUser.getName())
                .gender(newUser.getGender())
                .dateOfBirth(newUser.getDateOfBirth())
                .build();
        //map user to userDTO
        return log.traceExit("With account: ", accountRepository.save(nAccount));
    }
}
