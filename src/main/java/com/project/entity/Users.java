package com.project.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phoneNum")
    private String phoneNum;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "CCCD")
    private String CCCD;

    @Column(name = "type")
    private boolean type;

    @Column(name = "image")
    private Byte[] image;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Notification> notifyList;

    @OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Notification> notifications;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Room> roomList;


    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Revenue> revenueList;

    @OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Revenue> revenues;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Tenants> tenantsList;

    @ManyToMany(mappedBy = "usersSave", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Tus> tusSaveList;

    @OneToOne(mappedBy = "usersParent", cascade = CascadeType.ALL)
    private Tenants tenants;

    @OneToOne(mappedBy = "users", cascade = CascadeType.ALL)
    private Info info;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<Service> serviceList;

    public Users() {
    }

    public Users(String userName, String password, String name, String email, String phoneNum, boolean type) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.type = type;
    }

    public Users(String userName, String password, String name, String email, String phoneNum, Date birthday, String CCCD, boolean type, Byte[] image, List<Notification> notifyList, List<Notification> notifications, List<Room> roomList, List<Revenue> revenueList, List<Revenue> revenues, List<Tenants> tenantsList, List<Tus> tusSaveList, Tenants tenants, Info info, List<Service> serviceList) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.birthday = birthday;
        this.CCCD = CCCD;
        this.type = type;
        this.image = image;
        this.notifyList = notifyList;
        this.notifications = notifications;
        this.roomList = roomList;
        this.revenueList = revenueList;
        this.revenues = revenues;
        this.tenantsList = tenantsList;
        this.tusSaveList = tusSaveList;
        this.tenants = tenants;
        this.info = info;
        this.serviceList = serviceList;
    }
}
