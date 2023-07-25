package com.drrapps.bookofsecrets.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

@Entity(name = "account")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @UuidGenerator
    @Column(name = "id",length = 36)
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "security_fk")
    private Security securityFk;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_fk")
    private User userFk;

    @Column(name = "username")
    private String username;

    @Column(name = "userpassword")
    private String userpassword;

    @Column(name = "description")
    private String description;
}
