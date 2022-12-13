package com.project.reponse;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ProfileReponse {
    private int id;

    private String name;

    private boolean type;

    private String email;

    private String phone;

    private Date birthday;

    private String CCCD;

    private String room;

    private Byte[] image;

    public ProfileReponse() {
    }

    public ProfileReponse(int id, String name, boolean type, String email, String phone, Date birthday, String CCCD, String room, Byte[] image) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.CCCD = CCCD;
        this.room = room;
        this.image = image;
    }
}
