package com.drrapps.bookofsecrets.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

@Entity(name = "platform")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Platform {

    @Id
    @UuidGenerator
    @Column(name = "id" , length =36)
    private String id;

    @Column(name = "name" , length = 100)
    private String name;

    @Column(name = "description" , length = 200)
    private String description;
}
