package com.drrapps.bookofsecrets.builder;

import com.drrapps.bookofsecrets.dto.SecurityDto;
import com.drrapps.bookofsecrets.model.Security;
import org.springframework.stereotype.Component;

import java.security.Key;

@Component
public class SecurityBuilder {
    public Security DtoToSecurity(SecurityDto securityDto){
        return new Security().builder()
                .id(securityDto.getId())
                .key(securityDto.getKey()).build();
    }

    public SecurityDto createSecurityDto(Security security){
        return new SecurityDto().builder()
                .id(security.getId())
                .key(security.getKey()).build();
    }

}
