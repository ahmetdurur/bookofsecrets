package com.drrapps.bookofsecrets.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SecurityDto {
    private String id;
    private String key;
    private LocalDateTime createdate;

}
