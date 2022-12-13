package com.project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "revenue")
@Getter
@Setter
public class Revenue {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "type")
    private int type;

    @Column(name = "groups")
    private boolean groups;

    @Column(name = "price")
    private int price;

    @Column(name = "note")
    private String note;

    @Column(name = "time")
    private Date time;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Users tenant;

    public Revenue() {
    }

    public Revenue(String code, int type, boolean groups, int price, String note, Date time, Users users, Room room, Users tenant) {
        this.code = code;
        this.type = type;
        this.groups = groups;
        this.price = price;
        this.note = note;
        this.time = time;
        this.users = users;
        this.room = room;
        this.tenant = tenant;
    }
}
