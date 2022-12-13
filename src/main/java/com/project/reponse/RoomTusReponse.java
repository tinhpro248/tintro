package com.project.reponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomTusReponse {
    int id;
    String name;
    int num;
    int price;
    String address;
    Byte[] image;

    public RoomTusReponse() {
    }

    public RoomTusReponse(int id, String name, int num, int price, String address, Byte[] image) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.price = price;
        this.address = address;
        this.image = image;
    }
}
