package com.demo.store.dtos;

import lombok.Data;

@Data
public class ChangeUserPasswordDto {
    private String oldPassword;
    private String newPassword;
}
