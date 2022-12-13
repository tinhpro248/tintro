package com.project.reponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginReponse {
    private int id;
    private String name;
    private boolean type;
    private Byte[] image;

    public LoginReponse() {
    }

    public LoginReponse(int id, String name, boolean type, Byte[] image) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.image = image;
    }
}
