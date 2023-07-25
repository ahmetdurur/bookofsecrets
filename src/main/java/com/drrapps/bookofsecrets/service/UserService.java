package com.drrapps.bookofsecrets.service;

import com.drrapps.bookofsecrets.model.User;
import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User addUser(User user);
}
