package com.example.login.controller.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserProfile {

    private String username;

    private String email;

    private String role;

    private String phone_number;
}
