package com.drrapps.bookofsecrets.builder;

import com.drrapps.bookofsecrets.dto.UserDto;
import com.drrapps.bookofsecrets.model.User;
import org.springframework.stereotype.Component;
import java.time.LocalDate;


@Component
public class UserBuilder {

    public User dtoToUser(UserDto dto){
        return new User()
                .builder()
                .id(dto.getId())
                .name(dto.getName())
                .surname(dto.getSurname())
                .birthday(dto.getBirthday())
                .createdate(dto.getCreatedate())
                .build();
    }

    public UserDto userToDto(User user){
        return new UserDto()
                .builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .birthday(user.getBirthday())
                .createdate(user.getCreatedate())
                .build();
    }

}
