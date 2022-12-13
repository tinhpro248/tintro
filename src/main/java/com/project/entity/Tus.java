package com.project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tus")
@Getter
@Setter
public class Tus {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "time")
    private Date time;

    @Column(name = "note")
    private String note;

    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToMany
    @JoinTable(name = "user_tus", joinColumns = {
            @JoinColumn(name = "user_id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "tus_id")
    })
    private List<Users> usersSave;

    public Tus() {
    }

    public Tus(Date time, String note, Room room, List<Users> usersSave) {
        this.time = time;
        this.note = note;
        this.room = room;
        this.usersSave = usersSave;
    }
}
