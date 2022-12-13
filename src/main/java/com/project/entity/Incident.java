package com.project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "incident")
@Getter
@Setter
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "time")
    private Date time;

    @Column(name = "note")
    private String note;

    @Column(name = "type")
    private String type;

    @Column(name = "image")
    private Byte[] image;

    @Column(name = "status")
    private int status;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public Incident() {
    }

    public Incident(Date time, String note, String type, Byte[] image, int status, Room room) {
        this.time = time;
        this.note = note;
        this.type = type;
        this.image = image;
        this.room = room;
        this.status = status;
    }
}
