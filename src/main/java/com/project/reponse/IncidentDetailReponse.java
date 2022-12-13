package com.project.reponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IncidentDetailReponse {
    int id;
    String type;
    int roomId;
    String note;
    Byte[] image;

    public IncidentDetailReponse() {
    }

    public IncidentDetailReponse(int id, String type, int roomId, String note, Byte[] image) {
        this.id = id;
        this.type = type;
        this.roomId = roomId;
        this.note = note;
        this.image = image;
    }
}
