package com.project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "room")
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "area")
    private String area;

    @Column(name = "price")
    private int price;

    @Column(name = "number_of_tenants")
    private int numberOfTenants;

    @Column(name = "rent_from")
    private Date rentFrom;

    @Column(name ="sex")
    private String sex;

    @Column(name = "image")
    private Byte[] image;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Tenants> tenants;

    @OneToOne(mappedBy = "room", cascade = CascadeType.ALL)
    private Tus tus;

    @ManyToMany(mappedBy = "roomList", cascade = CascadeType.ALL)
    private List<Service> serviceList;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Revenue> revenueList;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Bill> billList;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Incident> incidentList;

    public Room() {
    }

    public Room(String name, String area, int price, int numberOfTenants, Date rentFrom, String sex, Users users, List<Tenants> tenants, Tus tus, List<Service> serviceList, List<Revenue> revenueList, List<Bill> billList, List<Incident> incidentList) {
        this.name = name;
        this.area = area;
        this.price = price;
        this.numberOfTenants = numberOfTenants;
        this.rentFrom = rentFrom;
        this.sex = sex;
        this.users = users;
        this.tenants = tenants;
        this.tus = tus;
        this.serviceList = serviceList;
        this.revenueList = revenueList;
        this.billList = billList;
        this.incidentList = incidentList;
    }
}
