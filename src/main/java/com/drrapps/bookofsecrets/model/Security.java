package com.drrapps.bookofsecrets.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;

@Entity(name = "security")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Security {

    @Id
    @UuidGenerator
    @Column(name = "id" , length =36)
    private String id;

    @Column(name = "key" , length = 32)
    private String key;

    @Column(name = "createdate")
    private LocalDateTime createdate;
}
