package com.project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "service")
@Getter
@Setter
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "type")
    private int type;

    @Column(name = "detail")
    private String detail;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToMany
    @JoinTable(name = "room_service", joinColumns = {
            @JoinColumn(name = "room_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "service_id")
    })
    private List<Room> roomList;

    public Service() {
    }

    public Service(String name, int price, int type, String detail, Users users, List<Room> roomList) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.detail = detail;
        this.users = users;
        this.roomList = roomList;
    }
}
