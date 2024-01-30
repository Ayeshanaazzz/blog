package com.blog.payload;

import lombok.Data;

@Data
public class LoginDto {// whatever details user is entering will go to this dto for authentication
    private String usernameOrEmail;
    private String password;
}
