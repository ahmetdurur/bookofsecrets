package com.drrapps.bookofsecrets.controller;

import com.drrapps.bookofsecrets.builder.UserBuilder;
import com.drrapps.bookofsecrets.model.User;
import com.drrapps.bookofsecrets.service.UserService;
import com.drrapps.bookofsecrets.util.AESUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;
    private final UserBuilder userBuilder;
    private final AESUtil aesUtil;

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAll(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatusCode.valueOf(200));
    }

    @PostMapping("/addUser")
    public ResponseEntity addUser (@RequestParam(value = "name")String name,@RequestParam(value = "surname")String surname, @RequestParam(value = "birthday")String birthday ){
        User user = new User(null, name, surname, LocalDate.parse(birthday), LocalDateTime.now());
        return new ResponseEntity(userService.addUser(user), HttpStatusCode.valueOf(200));
    }

}
