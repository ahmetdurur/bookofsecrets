package com.drrapps.bookofsecrets.controller;

import com.drrapps.bookofsecrets.builder.SecurityBuilder;
import com.drrapps.bookofsecrets.dto.SecurityDto;
import com.drrapps.bookofsecrets.model.Security;
import com.drrapps.bookofsecrets.service.SecurityService;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "security")
@RequiredArgsConstructor
public class SecurityController {

    private final SecurityService securityService;
    private final SecurityBuilder securityBuilder;

    @PostMapping(value = "/getSecurity" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SecurityDto> getSecurity (@RequestParam(value = "id") String id){
        Security security = securityService.getSecurityWithId(id);
        SecurityDto securityDto = securityBuilder.securitytoDto(security);
        return new ResponseEntity<>(securityDto, HttpStatusCode.valueOf(200));
    }

}
