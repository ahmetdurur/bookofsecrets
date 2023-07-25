package com.drrapps.bookofsecrets.repo;

import com.drrapps.bookofsecrets.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SecurityRepository extends JpaRepository<Security , String> {
    @Query("SELECT s FROM security s WHERE s.id = ?1")
    Security getSecurityWithId();
}
