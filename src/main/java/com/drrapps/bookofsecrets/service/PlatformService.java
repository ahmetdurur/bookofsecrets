package com.drrapps.bookofsecrets.service;

import com.drrapps.bookofsecrets.dto.PlatformDto;
import com.drrapps.bookofsecrets.model.Platform;

import java.util.List;

public interface PlatformService {
    public Platform addPlatform(Platform platform);
    public Platform getPlatformWithId(String id);
    public List<Platform> getAllPlatforms();
}
