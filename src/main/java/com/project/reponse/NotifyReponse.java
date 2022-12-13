package com.project.reponse;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class NotifyReponse {
    private int id;
    private String content;
    private Date time;
    private int type;

    public NotifyReponse() {
    }

    public NotifyReponse(int id, String content, Date time, int type) {
        this.id = id;
        this.content = content;
        this.time = time;
        this.type = type;
    }
}
