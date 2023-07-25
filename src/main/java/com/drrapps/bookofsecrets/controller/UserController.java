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

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAll(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatusCode.valueOf(200));
    }

    @PostMapping("/add")
    public ResponseEntity addUser (@RequestParam Map<String,String> allParamaters){
        return new ResponseEntity(userService.addUser(userBuilder.createUserDto(allParamaters)) , HttpStatusCode.valueOf(200));
    }

}
