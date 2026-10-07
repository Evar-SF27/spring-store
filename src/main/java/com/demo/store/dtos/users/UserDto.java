package com.demo.store.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDto {
    private Long id;
    private String name;
    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phoneNumber;
}
