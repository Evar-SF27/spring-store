package com.demo.store.dtos;

import lombok.Data;

@Data
public class CreateUserDto {
    private String name;
    private String email;
    private String password;
}

