package com.drrapps.bookofsecrets.controller;

import com.drrapps.bookofsecrets.dto.AccountDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
@RequiredArgsConstructor
@Slf4j
public class AccountController {

    @PostMapping(value = "addAccount")
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){

        return null;
    }
}
