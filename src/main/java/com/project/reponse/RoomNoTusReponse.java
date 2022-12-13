package com.project.reponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomNoTusReponse {
    int id;
    String name;
    int price;
    int num;
    Byte[] image;

    public RoomNoTusReponse() {
    }

    public RoomNoTusReponse(int id, String name, int price, int num, Byte[] image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.num = num;
        this.image = image;
    }
}
