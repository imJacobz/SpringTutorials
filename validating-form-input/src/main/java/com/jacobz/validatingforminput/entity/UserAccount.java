package com.jacobz.validatingforminput.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class UserAccount {
    private int id;

    @NotNull
    @Size(min=6, max=30)
    private String username;

    @NotNull
    @Size(min=6, max=50, message = "Password length must be between 6 and 50 characters long")
    private String password;

    @NotNull(message = "Email could not be null")
    @Pattern(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$", message = "email ain''t valid")
    private String email;
}
