package com.drrapps.bookofsecrets.controller;

import com.drrapps.bookofsecrets.builder.PlatformBuilder;
import com.drrapps.bookofsecrets.dto.PlatformDto;
import com.drrapps.bookofsecrets.model.Platform;
import com.drrapps.bookofsecrets.service.PlatformService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("platform")
@RequiredArgsConstructor
@Slf4j
public class PlatformController {

    private final PlatformService platformService;
    private final PlatformBuilder platformBuilder;

    @PostMapping(value = "addPlatform")
    public ResponseEntity<PlatformDto> addPlatform (@RequestBody PlatformDto platformDto){
        Platform platform = platformBuilder.dtoToPlatform(platformDto);
        platform.setCreatedate(LocalDateTime.now());
        platform = platformService.addPlatform(platform);
        platformDto = platformBuilder.platformToDto(platform);
        return new ResponseEntity<>(platformDto, HttpStatusCode.valueOf(200));
    }

    @GetMapping(value = "getPlatform")
    public ResponseEntity<PlatformDto> getPlatform(@RequestParam(value = "platformId") String platformId){
        PlatformDto platformDto = platformBuilder.platformToDto(platformService.getPlatformWithId(platformId));
        return new ResponseEntity<>(platformDto, HttpStatusCode.valueOf(200));
    }

    @GetMapping(value = "getAllPlatforms")
    public ResponseEntity<List<Platform>> getAllPlatforms(){
         List<Platform> platformList = platformService.getAllPlatforms();
         return new ResponseEntity<>(platformList, HttpStatusCode.valueOf(200));
    }

}
