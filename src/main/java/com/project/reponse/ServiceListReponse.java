package com.project.reponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceListReponse {
    int id;
    String name;
    int price;
    int type;

    public ServiceListReponse() {
    }

    public ServiceListReponse(int id, String name, int price, int type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
