package com.project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "notification")
@Getter
@Setter
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "content")
    private String content;

    @Column(name = "time")
    private Date time;

    @Column(name = "type")
    private int type;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Users tenant;

    public Notification() {
    }

    public Notification(String content, Date time, int type, Users users, Users tenant) {
        this.content = content;
        this.time = time;
        this.type = type;
        this.users = users;
        this.tenant = tenant;
    }
}
