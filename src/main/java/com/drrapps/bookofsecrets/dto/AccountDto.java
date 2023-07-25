package com.drrapps.bookofsecrets.dto;

import com.drrapps.bookofsecrets.model.Security;
import com.drrapps.bookofsecrets.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private String id;
    private Security securityFk;
    private User userFk;
    private String username;
    private String userpassword;
    private String description;
    private LocalDateTime createdate;
}
