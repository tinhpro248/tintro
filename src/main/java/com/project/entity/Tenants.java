package com.project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "tenants")
@Getter
@Setter
public class Tenants {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "time")
    private Date time;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    @OneToOne
    @JoinColumn(name = "tenant_id")
    private Users usersParent;

    public Tenants() {
    }

    public Tenants(Date time, Room room, Users users, Users usersParent) {
        this.time = time;
        this.room = room;
        this.users = users;
        this.usersParent = usersParent;
    }
}
