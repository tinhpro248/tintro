package com.project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "info")
@Getter
@Setter
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "price")
    private String price;

    @Column(name = "vote")
    private float vote;

    @Column(name = "sum")
    private int sum;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public Info() {
    }

    public Info(String name, String address, String price, float vote, int sum, Users users) {
        this.name = name;
        this.address = address;
        this.price = price;
        this.vote = vote;
        this.sum = sum;
        this.users = users;
    }
}
