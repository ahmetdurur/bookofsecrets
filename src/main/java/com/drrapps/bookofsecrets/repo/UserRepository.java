package com.drrapps.bookofsecrets.repo;


import com.drrapps.bookofsecrets.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
