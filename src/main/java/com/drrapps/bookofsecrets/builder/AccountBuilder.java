package com.drrapps.bookofsecrets.builder;

import com.drrapps.bookofsecrets.dto.AccountDto;
import com.drrapps.bookofsecrets.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountBuilder {

    public Account dtoToAccount(AccountDto dto){
        return new Account()
                .builder()
                .id(dto.getId())
                .securityFk(dto.getSecurityFk())
                .userFk(dto.getUserFk())
                .username(dto.getUsername())
                .userpassword(dto.getUserpassword())
                .description(dto.getDescription())
                .createdate(dto.getCreatedate())
                .build();
    }

    public AccountDto accountToDto(Account account){
        return new AccountDto()
                .builder()
                .id(account.getId())
                .securityFk(account.getSecurityFk())
                .userFk(account.getUserFk())
                .username(account.getUsername())
                .userpassword(account.getUserpassword())
                .description(account.getDescription())
                .createdate(account.getCreatedate())
                .build();
    }
}
