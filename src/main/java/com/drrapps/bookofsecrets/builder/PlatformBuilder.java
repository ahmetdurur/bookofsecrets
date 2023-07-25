package com.drrapps.bookofsecrets.builder;

import com.drrapps.bookofsecrets.dto.PlatformDto;
import com.drrapps.bookofsecrets.model.Platform;
import org.springframework.stereotype.Component;

@Component
public class PlatformBuilder {
    public Platform dtoToPlatform(PlatformDto dto){
        return new Platform()
                .builder()
                .id(dto.getId())
                .name(dto.getName())
                .description(dto.getDescription())
                .createdate(dto.getCreatedate())
                .build();
    }

    public PlatformDto platformToDto(Platform platform){
        return new PlatformDto()
                .builder()
                .id(platform.getId())
                .name(platform.getName())
                .description(platform.getDescription())
                .createdate(platform.getCreatedate())
                .build();
    }

}
