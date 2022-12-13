package com.project.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    String username;

    String name;
    String password;
    String phone;
    String email;
    boolean type;

    public UserRequest() {
    }

    public UserRequest(String username, String name, String password, String phone, String email, boolean type) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }
}
