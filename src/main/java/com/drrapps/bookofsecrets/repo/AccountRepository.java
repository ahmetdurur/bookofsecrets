package com.drrapps.bookofsecrets.repo;

import com.drrapps.bookofsecrets.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {
}
