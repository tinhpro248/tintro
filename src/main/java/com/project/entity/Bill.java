package com.project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "bill")
@Getter
@Setter
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "type")
    private int type;

    @Column(name = "price")
    private int price;

    @Column(name = "note")
    private String note;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "status")
    private int status;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public Bill() {
    }

    public Bill(String code, int type, int price, String note, Date startTime, Date endTime, int status, Room room) {
        this.code = code;
        this.type = type;
        this.price = price;
        this.note = note;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.room = room;
    }
}
