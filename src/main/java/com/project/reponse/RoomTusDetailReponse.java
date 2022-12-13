package com.project.reponse;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class RoomTusDetailReponse {
    int id;
    String name;
    int price;
    Byte[] image;
    String address;
    Date time;
    String userName;
    String phone;
    Byte[] userImage;
    float vote;
    String note;

    public RoomTusDetailReponse() {
    }

    public RoomTusDetailReponse(int id, String name, int price, Byte[] image, String address, Date time, String userName, String phone, Byte[] userImage, float vote, String note) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.address = address;
        this.time = time;
        this.userName = userName;
        this.phone = phone;
        this.userImage = userImage;
        this.vote = vote;
        this.note = note;
    }
}
