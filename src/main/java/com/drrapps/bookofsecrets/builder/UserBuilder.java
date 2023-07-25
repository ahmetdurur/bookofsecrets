package com.drrapps.bookofsecrets.builder;

import com.drrapps.bookofsecrets.dto.UserDto;
import com.drrapps.bookofsecrets.model.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Map;

@Component
public class UserBuilder {

    public User DtoToUser(UserDto dto){

        return new User().builder()
                .name(dto.getName())
                .surname(dto.getSurname())
                .birthday(dto.getBirthday()).build();
    }

    public UserDto createUserDto(Map<String,String> paramaters){

        return new UserDto().builder()
                .name(paramaters.get(UserDto.PARAM_NAME))
                .surname(paramaters.get(UserDto.PARAM_SURNAME))
                .birthday(LocalDate.parse(paramaters.get(UserDto.PARAM_BIRTHDAY))).build();
    }

}
