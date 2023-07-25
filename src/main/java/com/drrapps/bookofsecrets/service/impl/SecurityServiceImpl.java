package com.drrapps.bookofsecrets.service.impl;

import com.drrapps.bookofsecrets.model.Security;
import com.drrapps.bookofsecrets.repo.SecurityRepository;
import com.drrapps.bookofsecrets.service.SecurityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SecurityServiceImpl implements SecurityService {
    private final SecurityRepository securityRepository;


    @Override
    public Security getSecurityWithId(String id) {
        return securityRepository.getReferenceById(id);
    }
}
