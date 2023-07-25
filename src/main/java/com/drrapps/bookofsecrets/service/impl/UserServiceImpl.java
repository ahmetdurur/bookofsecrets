package com.drrapps.bookofsecrets.service.impl;

import com.drrapps.bookofsecrets.builder.UserBuilder;
import com.drrapps.bookofsecrets.model.User;
import com.drrapps.bookofsecrets.repo.UserRepository;
import com.drrapps.bookofsecrets.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserBuilder userBuilder;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
