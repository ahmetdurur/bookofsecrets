package com.drrapps.bookofsecrets.service.impl;

import com.drrapps.bookofsecrets.dto.PlatformDto;
import com.drrapps.bookofsecrets.model.Platform;
import com.drrapps.bookofsecrets.repo.PlatformRepository;
import com.drrapps.bookofsecrets.service.PlatformService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlatformServiceImpl implements PlatformService {

    private final PlatformRepository platformRepository;

    @Override
    public Platform addPlatform(Platform platform) {
        return platformRepository.save(platform);
    }

    @Override
    public Platform getPlatformWithId(String id) {
        return platformRepository.getReferenceById(id);
    }

    @Override
    public List<Platform> getAllPlatforms() {
        return platformRepository.findAll(Sort.by("name").ascending());
    }
}
