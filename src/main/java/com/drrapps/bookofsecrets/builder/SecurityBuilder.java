package com.drrapps.bookofsecrets.builder;

import com.drrapps.bookofsecrets.dto.SecurityDto;
import com.drrapps.bookofsecrets.model.Security;
import org.springframework.stereotype.Component;

import java.security.Key;

@Component
public class SecurityBuilder {
    public Security dtoToSecurity(SecurityDto dto){
        return new Security()
                .builder()
                .id(dto.getId())
                .key(dto.getKey())
                .createdate(dto.getCreatedate())
                .build();
    }

    public SecurityDto securitytoDto(Security security){
        return new SecurityDto()
                .builder()
                .id(security.getId())
                .key(security.getKey())
                .createdate(security.getCreatedate())
                .build();
    }

}
