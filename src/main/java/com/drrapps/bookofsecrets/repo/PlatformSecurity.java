package com.drrapps.bookofsecrets.repo;

import com.drrapps.bookofsecrets.model.Platform;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatformSecurity extends JpaRepository<Platform,String> {
}
