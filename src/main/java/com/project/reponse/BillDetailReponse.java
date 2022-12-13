package com.project.reponse;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BillDetailReponse {
    int id;
    String code;
    int type;
    int price;
    String note;
    int idRoom;
    Date startTime;
    Date endTime;

    public BillDetailReponse() {
    }

    public BillDetailReponse(int id, String code, int type, int price, String note, int idRoom, Date startTime, Date endTime) {
        this.id = id;
        this.code = code;
        this.type = type;
        this.price = price;
        this.note = note;
        this.idRoom = idRoom;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
